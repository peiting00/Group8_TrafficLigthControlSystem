/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem_pt;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author user
 */
public class Group9_TrafficLightControlSystem_PT {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        TrafficLightControl trafficControl = new TrafficLightControl();
       
        
        Car cars = new Car(trafficControl);
        Thread car = new Thread(cars);
        car.start();
        
        Pedestrain p = new Pedestrain(trafficControl);
        p.start();
        
        AllTrafficLight AllTrafficLights = new AllTrafficLight(trafficControl);
        AllTrafficLights.start();
        
        TrafficLights trafficLights = new TrafficLights(trafficControl);
        trafficLights.start();
        
      
    }
}
