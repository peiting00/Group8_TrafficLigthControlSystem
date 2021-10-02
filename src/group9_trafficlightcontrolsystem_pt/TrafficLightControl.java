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
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author user
 */
public class TrafficLightControl{
    
    TrafficModel tm = new TrafficModel();
    List<CarList> carList_North = new ArrayList<>();   
    List<CarList> carList_South= new ArrayList<>();   
    List<CarList> carList_East = new ArrayList<>();   
    List<CarList> carList_West = new ArrayList<>();   
    
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
    
    public synchronized void allowNorth() throws InterruptedException{
        while(!occupied.equals("N")){
            //System.out.println( "North waiting...");
            wait();
        }
        while(!carList_North.isEmpty()){
           for(int i=0;i<carList_North.size();i++){
               //System.out.println("     Car "+carList_North.get(i).getCarInfo()+" is LEAVING");
               System.out.println(carList_North.remove(i));
           }
        
        }
        notify();
    }
    
    public synchronized void allowSouth()throws InterruptedException{
        while(!occupied.equals("S")){
            //System.out.println("South waiting...");
            wait();
        }
        if(!carList_South.isEmpty()){
           for(int i=0;i<carList_South.size();i++){
               System.out.println("     Car "+carList_South.get(i).getCarInfo()+" is LEAVING");
               carList_South.remove(i);
               //notify();
           }
        }else{
            System.out.println("No car in South");
            //notify();
        }
        //System.out.println("    Car "+ carID +" leaves S");
        notify();
    }
    
    public synchronized void allowWest()throws InterruptedException{
        while(!occupied.equals("W")){
            //System.out.println("West waiting...");
            wait();
        }
        if(!carList_West.isEmpty()){
           for(int i=0;i<carList_West.size();i++){
               System.out.println("     Car "+carList_West.get(i).getCarInfo()+" is LEAVING");
               carList_West.remove(i);
               //notify();
           }
        }else{
            System.out.println("No car in North");
           // notify();
        }
       // System.out.println("    Car "+ carID +" leaves W");
        notify();
    }
    
    public synchronized void allowEast()throws InterruptedException{
        while(!occupied.equals("E")){
            //System.out.println("East waiting... current going: " + occupied );
            wait();
        }
        
        if(!carList_East.isEmpty()){
           for(int i=0;i<carList_East.size();i++){
               System.out.println("     Car "+carList_East.get(i).getCarInfo()+" is LEAVING");
               carList_East.remove(i);
               //notify();
           }
        }else{
            System.out.println("No car in North");
            //notify();
        }
        //System.out.println("    Car "+ carID +" leaves E");
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
    
    public synchronized void generateCarDirection(String carID)throws InterruptedException{
       
        String[] carDirection = {"N","E","S","W"};
        ArrayList<String> carAvailableFrom = new ArrayList<String>(Arrays.asList(carDirection));
        
        String tempRemovedDirection = "";
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
                    carList_North.add(new CarList(this,carID,from,goTo));
                    break;
                case("S"):
                    carList_South.add(new CarList(this,carID,from,goTo));
                    break;
                case("E"):
                    carList_East.add(new CarList(this,carID,from,goTo));
                    break;
                case("W"):
                    carList_West.add(new CarList(this,carID,from,goTo));
                    break;
                }
            
            System.out.println("@@ CarID:"+carID+" From:"+from+" GoTo:"+goTo);
            //return "From: "+from+"GoTo: "+goTo;
            
    }
    
}
