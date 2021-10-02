/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem_bw;

import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author user
 */
public class TrafficLightControl{
    Timer timer = new Timer();
    String occupied="";
    int i = 5;
    String [] seqDirection = {"N", "E", "S", "W", "P"};
    int currentIndex = 0;
    
    public TrafficLightControl(){
        
    }
    
    public synchronized void allowDirectionByTimer() throws InterruptedException{
        occupied = seqDirection[currentIndex];
        currentIndex = (currentIndex+1) % seqDirection.length;
        System.out.println("Allowing " + occupied + " to go");
        notify();
    }
    
    public synchronized void allowNorth(int carID) throws InterruptedException{
        while(!occupied.equals("N")){
            //System.out.println(carID + "North waiting...");
            wait();
        }
        
        System.out.println("Car"+ carID +" leaves N");
    }
    
    public synchronized void allowSouth(int carID)throws InterruptedException{
        while(!occupied.equals("S")){
            //System.out.println("South waiting...");
            wait();
        }
        
        System.out.println("Car"+ carID +" leaves S");
    }
    
    public synchronized void allowWest(int carID)throws InterruptedException{
        while(!occupied.equals("W")){
            //System.out.println("West waiting...");
            wait();
        }
        
        System.out.println("Car"+ carID +" leaves W");
    }
    
    public synchronized void allowEast(int carID)throws InterruptedException{
        while(!occupied.equals("E")){
            //System.out.println("East waiting... current going: " + occupied );
            wait();
        }
        
        System.out.println("Car"+ carID +" leaves E");
    }
    
    public synchronized void allowPedestrain()throws InterruptedException{
        while(!occupied.equals("P")){
            //System.out.println("Pedestrain waiting...");
            wait();
        }
        
        System.out.println("Pedestrain crossing road");
    }
}
