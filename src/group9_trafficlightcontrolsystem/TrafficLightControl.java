/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Timer;
import java.util.concurrent.LinkedBlockingDeque;

/**
 *
 * @author user
 */
public class TrafficLightControl {

    TrafficModel tm;

    Queue<CarInfo> northQueue = new LinkedBlockingDeque<CarInfo>();
    Queue<CarInfo> southQueue = new LinkedBlockingDeque<CarInfo>();
    Queue<CarInfo> eastQueue = new LinkedBlockingDeque<CarInfo>();
    Queue<CarInfo> westQueue = new LinkedBlockingDeque<CarInfo>();

    Timer timer = new Timer();
    private String green = "";
    
    private final String[] seqDirection = {"N", "E", "S", "W", "P"};//{"N", "E", "S", "W"};
    private int currentIndex = 0;
    private int pedestrianNum = 0;
    
    public TrafficLightControl(TrafficModel tm) {
        this.tm = tm;
        tm.setVisible(true); //initialize the Java GUI
    }
    
/***************************************************************
* Traffic Light Sequence Control
* ***************************************************************/ 
    public synchronized ArrayList<Integer> allowDirectionByTimer() throws InterruptedException {
        green = seqDirection[currentIndex]; //Set Which Traffic Light is Green
        
        currentIndex = (currentIndex + 1) % seqDirection.length;
        
        if(green.equals("P") && pedestrianNum == 0){
            green = "N";
            currentIndex = 1;
        }
        
        notify();
 
        tm.setWhichDirectionToColor(green, "G");//turn traffic light to Green in GUI
        displayWhichDirectionisTurningWhichColor ("GREEN");
        
        int i = 0;
        ArrayList<Integer> queuesSize = new ArrayList<Integer>();
        queuesSize.add(northQueue.size());
        queuesSize.add(eastQueue.size());
        queuesSize.add(southQueue.size());
        queuesSize.add(westQueue.size());
        queuesSize.add(pedestrianNum);
        
        return queuesSize;
    }

    public void setWhichDirectionToYellow() {
        tm.setWhichDirectionToColor(green, "Y");//turn traffic light to Yellow in GUI
        displayWhichDirectionisTurningWhichColor("YELLOW");
    }
    
    public void setWhichDirectionToRed() {
        tm.setWhichDirectionToColor(green, "R");//turn traffic light to Red in GUI
        displayWhichDirectionisTurningWhichColor ("RED");
        
        if(green.equals("P"))
            tm.setPedestrian("Pedestrian Crossing Light Inactive");//update GUI pedestrian
        green = "stop";
    }
    
    public void displayWhichDirectionisTurningWhichColor(String color){
        String direction = (green.equals("N")) ? "North " : 
                            (green.equals("S")) ? "South" :
                            (green.equals("E")) ? "East" : 
                            (green.equals("W")) ? "West" : "Pedestrian";
        
        String instructionToGUI = direction + " Traffic Light " + color;
        tm.setInstruction(instructionToGUI);
        
        System.out.println("\n=============================\n"+ 
                instructionToGUI + "\n=============================");
    }
/***************************************************************
* Allow car in North Traffic Light to GO
* ***************************************************************/ 
    public synchronized CarInfo allowNorth() throws InterruptedException {
        while (!green.equals("N")) {
            wait();
        }
        
        CarInfo carLeft = null;
        
        if (!northQueue.isEmpty()) {
//            for(CarList i : northQueue){
//                System.out.println(i.getCarID());
//            }

            carLeft = northQueue.poll();
            System.out.println("                North Car Leaving: " + carLeft.getCarID()+" | Total Car Left: "+northQueue.size());
            tm.addCarToNorthQueue(northQueue);
        }
        
        tm.setNorthTotalCar(northQueue.size());// update total car in GUI
        notify();
        
        return carLeft;
    }
/***************************************************************
* Allow car in South Traffic Light to GO
* ***************************************************************/ 
    public synchronized CarInfo allowSouth() throws InterruptedException {
        while (!green.equals("S")) {
            wait();
        }
        
        CarInfo carLeft = null;
        
        if (!southQueue.isEmpty()) {
            carLeft = southQueue.poll();
            System.out.println("                South Car Leaving: " + carLeft.getCarID()+" | Total Car Left: "+southQueue.size());
            tm.addCarToSouthQueue(southQueue);
        }
        
        tm.setSouthTotalCar(southQueue.size());// update total car in GUI
        notify();
        
        return carLeft;
    }
/***************************************************************
* Allow car in West Traffic Light to GO
* ***************************************************************/ 
    public synchronized CarInfo allowWest() throws InterruptedException {
        while (!green.equals("W")) {
            wait();
        }
        CarInfo carLeft = null;
        if (!westQueue.isEmpty()) {
            carLeft = westQueue.poll();
            System.out.println("                West Car Leaving: " + carLeft.getCarID()+" | Total Car Left: "+westQueue.size());
            tm.addCarToWestQueue(westQueue);
        }     
        
        tm.setWestTotalCar(westQueue.size());// update total car in GUI
        notify();
        
        return carLeft;
    }
/***************************************************************
* Allow car in East Traffic Light to GO
* ***************************************************************/ 
    public synchronized CarInfo allowEast() throws InterruptedException {
        while (!green.equals("E")) {
            wait();
        }
        
        CarInfo carLeft = null;
        
        if (!eastQueue.isEmpty()) {
            carLeft = eastQueue.poll();
            System.out.println("                East Car Leaving: " + carLeft.getCarID()+" | Total Car Left: "+eastQueue.size());
            tm.addCarToEastQueue(eastQueue);
        }       
        
        tm.setEastTotalCar(eastQueue.size());// update total car in GUI
        notify();
        
        return carLeft;
    }
/***************************************************************
* Allow Pedestrian to cross
* ***************************************************************/ 
    public synchronized void allowPedestrian() throws InterruptedException {
        
        while(!green.equals("P")){
            wait();
        }
        if(pedestrianNum != 0 && green.equals("P")){
            System.out.println("                Pedestrian Leaving....." + " | Pedestrian(s) Left:"+ --pedestrianNum);
            //pedestrianNum--;
            
        }
        notify();
    }

/***************************************************************
* To auto generate car for the 4 direction traffic light and update GUI
* ***************************************************************/  
    public synchronized void addCarToQueue(CarInfo car) throws InterruptedException {
        
        switch (car.getFrom()) {
            case ("N")://North Traffic Light
                northQueue.add(car);//add car to queue for North traffic light
                tm.setNorthTotalCar(northQueue.size());//set GUI total car
                tm.addCarToNorthQueue(northQueue);//set GUI car model
                break;
            case ("S")://south Traffic Light
                southQueue.add(car);//add car to queue for South traffic light
                tm.setSouthTotalCar(southQueue.size());//set GUI total car
                tm.addCarToSouthQueue(southQueue);//set GUI car model
                break;
            case ("E")://East Traffic Light
                eastQueue.add(car);//add car to queue for East traffic light
                tm.setEastTotalCar(eastQueue.size());//set GUI total car
                tm.addCarToEastQueue(eastQueue);//set GUI car model
                break;
            case ("W")://West Traffic Light
                westQueue.add(car);//add car to queue for West traffic light
                tm.setWestTotalCar(westQueue.size());//set GUI total car
                tm.addCarToWestQueue(westQueue);//set GUI car model
                break;
        }
        //Display the incoming car from which direction to which direction
        //with random car plate number
        System.out.println(car.getFrom() + " -> " + car.getGoTo() + ", Car Plate Number:" + car.getCarID());
        notify();
    }
/***************************************************************
* To add pedestrian and update GUI
* ***************************************************************/     
    public synchronized void generatePedestrian(){
        String pedestrianInstruction="Pedestrain Crossing Button has been Pushed";
        if(pedestrianNum==0)
            System.out.println("\n=======================================\n"
                + pedestrianInstruction+"\n=======================================\n");
        pedestrianNum++;
        System.out.println("Pefestrian Coming...    |  Total Pedestrain:" + pedestrianNum);
        tm.setPedestrian(pedestrianInstruction);//update GUI pedestrian number
        notify();
    }
}
