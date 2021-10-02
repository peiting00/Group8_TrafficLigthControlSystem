/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem_bw;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Group9_TrafficLightControlSystem_BW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TrafficLightControl trafficControl = new TrafficLightControl();
        
        AllTrafficLight trafficLights = new AllTrafficLight(trafficControl);
        trafficLights.start();
        //Pedestrain p = new Pedestrain(control);
       
        ArrayList<String> carAvailableFrom = new ArrayList<String>();
        carAvailableFrom.add("N");
        carAvailableFrom.add("E");
        carAvailableFrom.add("S");
        carAvailableFrom.add("W");
        
        String tempRemovedDirection = "";
        String from = "";
        String goTo = "";
        
        Car[] car = new Car[10];
        for (int count = 0; count < car.length; count++) {
            int randomIndex = (int)(Math.random()* carAvailableFrom.size());
            
            from = carAvailableFrom.get(randomIndex); //randomize where they came from (N, S, E, or W)
            
            //randomize where they want to go (N, S, E, or W), but excluding their current location
            carAvailableFrom.remove(from);
            int randomGoTo = (int)(Math.random()*carAvailableFrom.size());
            
            goTo = carAvailableFrom.get(randomGoTo); 

            carAvailableFrom.add(from);
        
            car[count] = new Car (trafficControl, count, from, goTo);
            System.out.println("car " + count + " from "+ from + " require go to " + goTo);
            car[count].start();
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
}
