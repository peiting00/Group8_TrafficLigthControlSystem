/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.LinkedBlockingDeque;

/**
 *
 * @author user
 */
public class TrafficLightControl {

    TrafficModel tm = new TrafficModel();

    Queue<String> northQueue = new LinkedBlockingDeque<String>();
    Queue<String> southQueue = new LinkedBlockingDeque<String>();
    Queue<String> eastQueue = new LinkedBlockingDeque<String>();
    Queue<String> westQueue = new LinkedBlockingDeque<String>();

    Timer timer = new Timer();
    private String green = "";
    
    private final String[] seqDirection = {"N", "E", "S", "W", "P"};//{"N", "E", "S", "W"};
    private int currentIndex = 0;
    
    private int pedestrianNum = 0;
    
    public TrafficLightControl() {
        //tm = tm;
        tm.setVisible(true);
    }

    public synchronized void allowDirectionByTimer() throws InterruptedException {
        green = seqDirection[currentIndex]; //Set Which Traffic Light is Green
        notify();
        currentIndex = (currentIndex + 1) % seqDirection.length;
        
        if(green.equals("P") && pedestrianNum == 0){
            green = "N";
            currentIndex = 0;
        }
 
        tm.setWhichDirectionToColor(green, "G");
        
        displayWhichDirectionisTurningWhichColor ("GREEN");
    }

    public void setWhichDirectionToYellow() {
        tm.setWhichDirectionToColor(green, "Y");
        
        displayWhichDirectionisTurningWhichColor("YELLOW");
    }
    
    public void displayWhichDirectionisTurningWhichColor(String color){
        String direction = (green.equals("N")) ? "North " : 
                            (green.equals("S")) ? "South" :
                            (green.equals("E")) ? "East" : 
                            (green.equals("W")) ? "West" : "Pedestrian";
        
        String instructionToGUI = direction + " Traffic Light " + color;
        tm.setInstruction(instructionToGUI);
        
        System.out.println("\n=============================\n"+ instructionToGUI + "\n=============================");
    }

    public void setWhichDirectionToRed() {
        tm.setWhichDirectionToColor(green, "R");
        
        displayWhichDirectionisTurningWhichColor ("RED");
    }

    public synchronized void allowNorth() throws InterruptedException {
        while (!green.equals("N")) {
            wait();
        }

        if (!northQueue.isEmpty()) {
            System.out.println("                North Car Leaving: " + northQueue.poll());
        }
        
        tm.setNorthTotalCar(northQueue.size());// update total car in GUI
        notify();
    }

    public synchronized void allowSouth() throws InterruptedException {
        while (!green.equals("S")) {
            wait();
        }
        
        if (!southQueue.isEmpty()) {
            System.out.println("                South Car Leaving: " + southQueue.poll());
        }
        
        tm.setSouthTotalCar(southQueue.size());// update total car in GUI
        notify();
    }

    public synchronized void allowWest() throws InterruptedException {
        while (!green.equals("W")) {
            wait();
        }
        
        if (!westQueue.isEmpty()) {
            System.out.println("                West Car Leaving: " + westQueue.poll());
        }
        
        tm.setWestTotalCar(westQueue.size());// update total car in GUI
        notify();
    }

    public synchronized void allowEast() throws InterruptedException {
        while (!green.equals("E")) {
            wait();
        }
        
        if (!eastQueue.isEmpty()) {
            System.out.println("                East Car Leaving: " + eastQueue.poll());
        }
        
        tm.setEastTotalCar(eastQueue.size());// update total car in GUI
        notify();
    }

    public synchronized void allowPedestrain() throws InterruptedException {
        
        while(!green.equals("P")){
            wait();
        }
        
        if(pedestrianNum != 0 && green.equals("P")){
            System.out.println("                Pedestrian crossing :" + pedestrianNum + " Pedestrian(s) left");
            pedestrianNum--;
        }
        
        notify();
    }

    public synchronized void generateCarDirection(String carID) throws InterruptedException {

        String[] carDirection = {"N", "E", "S", "W"};
        ArrayList<String> carAvailableFrom = new ArrayList<String>(Arrays.asList(carDirection));

        String from = "";
        String goTo = "";

        int randomIndex = (int) (Math.random() * carAvailableFrom.size());
        from = carAvailableFrom.get(randomIndex); //randomize where they came from (N, S, E, or W)
        //randomize where they want to go (N, S, E, or W), but excluding their current location
        carAvailableFrom.remove(from);
        int randomGoTo = (int) (Math.random() * carAvailableFrom.size());
        goTo = carAvailableFrom.get(randomGoTo);
        carAvailableFrom.add(from);//add back the direction

        switch (from) {
            case ("N"):
                //carList_North.add(new CarList(this,carID,from,goTo));
                northQueue.add(carID);
                tm.setNorthTotalCar(northQueue.size());
                break;
            case ("S"):
                //carList_South.add(new CarList(this,carID,from,goTo));
                southQueue.add(carID);
                tm.setSouthTotalCar(southQueue.size());
                break;
            case ("E"):
                //carList_East.add(new CarList(this,carID,from,goTo));
                eastQueue.add(carID);
                tm.setEastTotalCar(eastQueue.size());
                break;
            case ("W"):
                //carList_West.add(new CarList(this,carID,from,goTo));
                westQueue.add(carID);
                tm.setWestTotalCar(westQueue.size());
                break;
        }

        System.out.println(from + " -> " + goTo + ", Car Plate Number:" + carID);
        notify();

    }
    
    public synchronized void generatePedestrian(){
        pedestrianNum++;
        
        System.out.println("Pedestrian Amount:" + pedestrianNum);
        notify();
    }
}
