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
        TrafficModel tm = new TrafficModel();
        
        
        
        TrafficLightControl trafficControl = new TrafficLightControl(tm);
        AllTrafficLight AllTrafficLights = new AllTrafficLight(trafficControl, tm);
        AllTrafficLights.start();
        CarNorth carsNorth = new CarNorth (trafficControl);
        carsNorth.start();
        
        CarSouth carsSouth = new CarSouth (trafficControl);
        carsSouth.start();
        
        CarEast carsEast = new CarEast (trafficControl);
        carsEast.start();
        
        CarWest carsWest = new CarWest (trafficControl);
        carsWest.start();
        
        
        Pedestrian pedestrians = new Pedestrian(trafficControl,tm);
        Thread pedestrian = new Thread(pedestrians);
        pedestrian.start();
        
        PedestrianTraffic p = new PedestrianTraffic(trafficControl);
        p.start();
        
        //TrafficLights trafficLights = new TrafficLights(trafficControl);
        //trafficLights.start();
        NorthTraffic n = new NorthTraffic(trafficControl, tm);
        n.start();
        
        SouthTraffic s = new SouthTraffic(trafficControl, tm);
        s.start();
        
        EastTraffic e = new EastTraffic(trafficControl, tm);
        e.start();
        
        WestTraffic w = new WestTraffic(trafficControl, tm);
        w.start();
        
        
        
        
      
    }
}
