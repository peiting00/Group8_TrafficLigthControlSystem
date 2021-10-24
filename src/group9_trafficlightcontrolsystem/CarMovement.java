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
                        toSouthOrWest();   
                        toSouth();
                    }
                    else{
                        toSouthOrWest();   
                        toWest();
                    }
                    
                    break;
                
                case "S":
                    if(goTo.equals("E")){
                        toNorthOrEast();
                        toEast();
                    }
                    else if(goTo.equals("W")){
                        toWest();
                    }
                    else{
                        toNorthOrEast();
                        toNorth();
                    }
                    break;
                    
                case "E":
                    fromEast();
                    
                    if(goTo.equals("S")){
                        toSouth();
                    }
                    else if(goTo.equals("W")){
                        toWest();
                    }
                    else{
                        toNorthOrEast();
                        toNorth();
                    }
                    
                    break;
                    
                case "W":
                    fromWest();
                    
                    if(goTo.equals("S")){
                        toSouthOrWest();
                        toSouth();
                    }
                    else if(goTo.equals("E")){
                        toEast();
                    }
                    else{
                        toNorth();
                    }
                    
                    break;
            }
            
        }catch(InterruptedException e){
            
        }
        
    }
    
    public void toNorthOrEast() throws InterruptedException{
        tm.toNorthOrEast();
        Thread.sleep(1000);
        tm.toNorthOrEastErase();
    }
    
    public void toSouthOrWest() throws InterruptedException{
        tm.toSouthOrWest();
        Thread.sleep(1000);
        tm.toSouthOrWestErase();
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
    
    public void toNorth() throws InterruptedException{
        tm.northCar4();
        Thread.sleep(1000);
        tm.northCar4Erase();
        
        tm.northCar5();
        Thread.sleep(1000);
        tm.northCar5Erase();
        
        tm.northCar6();
        Thread.sleep(1000);
        tm.northCar6Erase();
    }
    
    public void fromEast() throws InterruptedException {
        tm.fromEast();
        Thread.sleep(1000);
        tm.fromEastErase();
    }
    
    public void fromWest() throws InterruptedException{
        tm.fromWest();
        Thread.sleep(1000);
        tm.fromWestErase();
    }
}
