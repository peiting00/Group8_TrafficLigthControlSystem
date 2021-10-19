/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem_pt;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author user
 */
public class TrafficLightControl{
    
    TrafficModel tm = new TrafficModel();
//    List<CarList> carList_North = new ArrayList<>();   
//    List<CarList> carList_South= new ArrayList<>();   
//    List<CarList> carList_East = new ArrayList<>();   
//    List<CarList> carList_West = new ArrayList<>();   
    Queue<String> northQueue = new PriorityQueue<String>();
    Queue<String> southQueue = new PriorityQueue<String>();
    Queue<String> eastQueue = new PriorityQueue<String>();
    Queue<String> westQueue = new PriorityQueue<String>();
    
    
    Timer timer = new Timer();
    String occupied="";
    int i = 5;
    String [] seqDirection = {"N", "E", "S", "W"}; //{"N", "E", "S", "W", "P"};
    int currentIndex = 0;
    
    public TrafficLightControl(){
        tm=tm;
        tm.setVisible(true);
    }
    
    public synchronized void allowDirectionByTimer() throws InterruptedException{
        occupied = seqDirection[currentIndex];
        currentIndex = (currentIndex+1) % seqDirection.length;
        //System.out.println("            Allowing " + occupied + " to go");
        
        tm.setWhichDirectionToColor(occupied, "G");
        
//        switch(occupied){
//            case("N"):
//                tm.setNorthToGreen();
//                System.out.println("========North is Green");
//                //tm.setBackground(Color.yellow);
//                break;
//            case("S"):
//                tm.setSouthToGreen();
//                System.out.println("========South is Green");
//                //tm.setBackground(Color.yellow);
//                break;
//            case("E"):
//                tm.setEastToGreen();
//                System.out.println("========East is Green");
//                //tm.setBackground(Color.yellow);
//                break;
//            case("W"):
//                tm.setWestToGreen();
//                System.out.println("========West is Green");
//                //tm.setBackground(Color.yellow);
//                break;    
//        }
        System.out.println("Occupied " + occupied);
        notify();
        
    }
    
    public void setWhichDirectionToYellow(){
        tm.setWhichDirectionToColor(occupied, "Y");
    }
    
    public void setWhichDirectionToRed(){
        tm.setWhichDirectionToColor(occupied, "R");
    }
    
    public synchronized void allowNorth() throws InterruptedException{
        while(!occupied.equals("N")){
            wait();
        }
        
        if(!northQueue.isEmpty()){
            System.out.println("           "+northQueue.poll()+" is leaving North");
            Thread.sleep(1000);
        }
        
        notify();  
    }
    
    public synchronized void allowSouth()throws InterruptedException{
        while(!occupied.equals("S")){
            wait();
        }
        if(!southQueue.isEmpty()){
            System.out.println("          "+southQueue.poll()+" is leaving South");
            Thread.sleep(1000);
        }
        notify();
    }
    
    public synchronized void allowWest()throws InterruptedException{
        while(!occupied.equals("W")){
            wait();
        }
        if(!westQueue.isEmpty()){
            System.out.println("        "+westQueue.poll()+" is leaving West");
            Thread.sleep(1000);
        }
        notify();
    }
    
    public synchronized void allowEast()throws InterruptedException{
        while(!occupied.equals("E")){
            wait();
        }
        if(!eastQueue.isEmpty()){
            System.out.println("         "+eastQueue.poll()+" is leaving East");
            Thread.sleep(1000);
        }
        notify();
    }
    
    public synchronized void allowPedestrain()throws InterruptedException{
        while(!occupied.equals("P")){
            //System.out.println("Pedestrain waiting...");
            wait();
        }
        notify();
    }
    
    public synchronized void generateCarDirection(String carID)throws InterruptedException{
       
        String[] carDirection = {"N","E","S","W"};
        ArrayList<String> carAvailableFrom = new ArrayList<String>(Arrays.asList(carDirection));
        
        String from = "";
        String goTo = "";
        
        int randomIndex = (int)(Math.random()* carAvailableFrom.size());
        from = carAvailableFrom.get(randomIndex); //randomize where they came from (N, S, E, or W)
        //randomize where they want to go (N, S, E, or W), but excluding their current location
        carAvailableFrom.remove(from);
        int randomGoTo = (int)(Math.random()*carAvailableFrom.size());
        goTo = carAvailableFrom.get(randomGoTo);
        carAvailableFrom.add(from);//add back the direction

        switch(from){
            case("N"):
                //carList_North.add(new CarList(this,carID,from,goTo));
                northQueue.add(carID);
                break;
            case("S"):
                //carList_South.add(new CarList(this,carID,from,goTo));
                southQueue.add(carID);
                break;
            case("E"):
                //carList_East.add(new CarList(this,carID,from,goTo));
                eastQueue.add(carID);
                break;
            case("W"):
                //carList_West.add(new CarList(this,carID,from,goTo));
                westQueue.add(carID);
                break;
            }

        System.out.println("@@ CarID:"+carID+" From:"+from+" GoTo:"+goTo);
        notify();
            
    }
    
}
