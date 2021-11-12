/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group8_trafficlightcontrolsystem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class CarEast extends Thread{
    TrafficLightControl trafficControl;
    CarInfo car;
    
    public CarEast(TrafficLightControl trafficControl){
        this.trafficControl = trafficControl;
    }
    
    public void run(){
        int durationEast = 8000;
        
        while(true){
            try {                    
                while(durationEast > 2000){
                    CarInfo car = new CarInfo("E");
                    trafficControl.addCarToQueue(car);
                    durationEast -= (durationEast > 5000) ? 500 : 250;
                    Thread.sleep(durationEast);
                }
                
                while(durationEast < 8000){
                    CarInfo car = new CarInfo("E");
                    trafficControl.addCarToQueue(car);
                    durationEast += 500;
                    Thread.sleep(durationEast);
                }
                
                Thread.sleep((int)(Math.random() * (4000 - 1000)) + 1000);
            }catch(InterruptedException ex){
                Logger.getLogger(CarEast.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}