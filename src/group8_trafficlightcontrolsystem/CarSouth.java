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
public class CarSouth extends Thread{
    TrafficLightControl trafficControl;
    CarInfo car;
    
    public CarSouth(TrafficLightControl trafficControl){
        this.trafficControl = trafficControl;
    }
    
    public void run(){
        while(true){
            try {    
                CarInfo car = new CarInfo("S");
                trafficControl.addCarToQueue(car);
                
                Thread.sleep((int)(Math.random() * (10000 - 5000)) + 5000);
            }catch(InterruptedException ex){
                Logger.getLogger(CarSouth.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}