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
       
        while(true){
            try {    
                CarInfo car = new CarInfo("N");
                trafficControl.addCarToQueue(car);
                    
                Thread.sleep((int)(Math.random() * (2000 - 500)) + 500);
                
            }catch(InterruptedException ex){
                Logger.getLogger(CarNorth.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}