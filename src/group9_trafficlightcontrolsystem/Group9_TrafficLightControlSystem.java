/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author user
 */
public class Group9_TrafficLightControlSystem {

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
        
        //TrafficLights trafficLights = new TrafficLights(trafficControl);
        //trafficLights.start();
        NorthTraffic n = new NorthTraffic(trafficControl);
        n.start();
        
        SouthTraffic s = new SouthTraffic(trafficControl);
        s.start();
        
        EastTraffic e = new EastTraffic(trafficControl);
        e.start();
        
        WestTraffic w = new WestTraffic(trafficControl);
        w.start();
        
        AllTrafficLight AllTrafficLights = new AllTrafficLight(trafficControl);
        AllTrafficLights.start();
        
        
      
    }
}
