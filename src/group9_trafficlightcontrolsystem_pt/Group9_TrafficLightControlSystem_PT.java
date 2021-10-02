/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem_pt;


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
        
        AllTrafficLight trafficLights = new AllTrafficLight(trafficControl);
        trafficLights.start();
        
        Car cars = new Car(trafficControl);
        Thread car = new Thread(cars);
        car.start();
        
        Pedestrain p = new Pedestrain(trafficControl);
        p.start();
      
    }
}
