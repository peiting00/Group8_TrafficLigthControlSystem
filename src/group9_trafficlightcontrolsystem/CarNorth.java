/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class CarNorth extends Thread{
    
    TrafficModel tm ;
    TrafficLightControl trafficControl;
    CarInfo car;
    
    public CarNorth(TrafficLightControl trafficControl){
        this.trafficControl = trafficControl;
    }
    
    public void run(){
       int durationNorth = 8000;
        
        while(true){
            try {    
                while(durationNorth > 1000){
                    CarInfo car = new CarInfo("N");
                    trafficControl.addCarToQueue(car);
                    
                    durationNorth -= (durationNorth > 5000) ? 500 : 250;
                    Thread.sleep(durationNorth);
                }
                
                while(durationNorth < 8000){
                    CarInfo car = new CarInfo("N");
                    trafficControl.addCarToQueue(car);
                    durationNorth += 1000;
                    Thread.sleep(durationNorth);
                }
            }catch(InterruptedException ex){
                Logger.getLogger(CarNorth.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}