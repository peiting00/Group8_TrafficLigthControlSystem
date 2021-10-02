/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem_bw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class Car extends Thread{
    TrafficLightControl trafficControl;
    
    private int carID;
    private String from;
    private String goTo;
    
    public Car(TrafficLightControl trafficControl, int carID, String from, String goTo){
        this.carID = carID;
        this.trafficControl = trafficControl;
        this.from = from;
        this.goTo = goTo;
        
    }
    
    public void run(){
        try {
            
            if(from.equals("N")){
                trafficControl.allowNorth(carID);
            }
            else if(from.equals("E")){
                trafficControl.allowEast(carID);
            }
            else if(from.equals("S")){
                trafficControl.allowSouth(carID);
            }
            else{
                trafficControl.allowWest(carID);
            }
        
        } catch (InterruptedException ex) {
                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
