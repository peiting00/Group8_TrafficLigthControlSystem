/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem_pt;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author user
 */
public class TrafficLights extends Thread{
     TrafficLightControl trafficControl;
    
    public TrafficLights(TrafficLightControl trafficControl){
        this.trafficControl = trafficControl;
    }
    
    public void run(){
        try{
            
            while(true){
                trafficControl.allowNorth();
                trafficControl.allowSouth();
                trafficControl.allowEast();
                trafficControl.allowWest();
            }
            
        }catch(InterruptedException e){
            e.printStackTrace();
        }   
    }
}
