/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem;

/**
 *
 * @author asus
 */
public class CarMovement extends Thread{
    TrafficModel tm;
    String from = "";
    String goTo = "";
    
    
    public CarMovement(String from, String goTo, TrafficModel tm){
        this.tm = tm;
        this.from = from;
        this.goTo = goTo;
    }
    
    public void run(){
        try{
            switch(from){
                case "N":
                    if(goTo.equals("E")){
                        toEast();
                    }
                    else if(goTo.equals("S")){
                        tm.toSouthOrWest();
                        Thread.sleep(1000);
                        tm.toSouthOrWestErase();
                        
                        toSouth();
                    }
                    else{
                        tm.toSouthOrWest();
                        Thread.sleep(1000);
                        tm.toSouthOrWestErase();
                        
                        toWest();
                    }
                    
                    break;
                
                case "S":
                    break;
            }
            
        }catch(InterruptedException e){
            
        }
        
    }
    
    public void toEast() throws InterruptedException{
        tm.toEast();
        Thread.sleep(1000);
        tm.toEastErase();
                
        tm.eastCar4();
        Thread.sleep(1000);
        tm.eastCar4Erase();
        
        tm.eastCar5();
        Thread.sleep(1000);
        tm.eastCar5Erase();
        
        tm.eastCar6();
        Thread.sleep(1000);
        tm.eastCar6Erase();
    }
    
    public void toWest() throws InterruptedException{
        tm.toWest();
        Thread.sleep(1000);
        tm.toWestErase();
                
        tm.westCar4();
        Thread.sleep(1000);
        tm.westCar4Erase();
        
        tm.westCar5();
        Thread.sleep(1000);
        tm.westCar5Erase();
        
        tm.westCar6();
        Thread.sleep(1000);
        tm.westCar6Erase();
    }
    
    public void toSouth() throws InterruptedException{
        tm.southCar3();
        Thread.sleep(1000);
        tm.southCar3Erase();
        
        tm.southCar4();
        Thread.sleep(1000);
        tm.southCar4Erase();
    }
}
