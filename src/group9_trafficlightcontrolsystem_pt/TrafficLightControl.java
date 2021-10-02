/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem_pt;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author user
 */
public class TrafficLightControl{
    
    TrafficModel tm = new TrafficModel();
        
    
    Timer timer = new Timer();
    String occupied="";
    int i = 5;
    String [] seqDirection = {"N", "E", "S", "W", "P"};
    int currentIndex = 0;
    
    public TrafficLightControl(){
        tm=tm;
        tm.setVisible(true);
    }
    
    public synchronized void allowDirectionByTimer() throws InterruptedException{
        occupied = seqDirection[currentIndex];
        currentIndex = (currentIndex+1) % seqDirection.length;
        System.out.println("Allowing " + occupied + " to go");
        
        switch(occupied){
            case("N"):
                tm.setNorthToGreen();
                System.out.println("North is Green");
                //tm.setBackground(Color.yellow);
                break;
            case("S"):
                tm.setSouthToGreen();
                System.out.println("South is Green");
                //tm.setBackground(Color.yellow);
                break;
            case("E"):
                tm.setEastToGreen();
                System.out.println("East is Green");
                //tm.setBackground(Color.yellow);
                break;
            case("W"):
                tm.setWestToGreen();
                System.out.println("West is Green");
                //tm.setBackground(Color.yellow);
                break;
                
                
        }
        
        
        notify();
    }
    
    public synchronized void allowNorth(String carID) throws InterruptedException{
        while(!occupied.equals("N")){
            //System.out.println(carID + "North waiting...");
            wait();
        }
        
        System.out.println("    Car "+ carID +" leaves N");
        notify();
    }
    
    public synchronized void allowSouth(String carID)throws InterruptedException{
        while(!occupied.equals("S")){
            //System.out.println("South waiting...");
            wait();
        }
        
        System.out.println("    Car "+ carID +" leaves S");
        notify();
    }
    
    public synchronized void allowWest(String carID)throws InterruptedException{
        while(!occupied.equals("W")){
            //System.out.println("West waiting...");
            wait();
        }
        
        System.out.println("    Car "+ carID +" leaves W");
        notify();
    }
    
    public synchronized void allowEast(String carID)throws InterruptedException{
        while(!occupied.equals("E")){
            //System.out.println("East waiting... current going: " + occupied );
            wait();
        }
        
        System.out.println("    Car "+ carID +" leaves E");
        notify();
    }
    
    public synchronized void allowPedestrain()throws InterruptedException{
        while(!occupied.equals("P")){
            //System.out.println("Pedestrain waiting...");
            wait();
        }
        
        System.out.println("Pedestrain crossing road");
        notify();
    }
}
