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
public class CarWest extends Thread{
    TrafficLightControl trafficControl;
    CarInfo car;
    
    public CarWest(TrafficLightControl trafficControl){
        this.trafficControl = trafficControl;
    }
    
    public void run(){
        while(true){
            try {    
                CarInfo car = new CarInfo("W");
                trafficControl.addCarToQueue(car);
                
                Thread.sleep((int)(Math.random() * (10000 - 8000)) + 8000);
            }catch(InterruptedException ex){
                Logger.getLogger(CarWest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}