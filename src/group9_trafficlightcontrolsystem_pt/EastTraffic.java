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
public class EastTraffic extends Thread{
     TrafficLightControl trafficControl;
    
    public EastTraffic(TrafficLightControl trafficControl){
        this.trafficControl = trafficControl;
    }
    
    public void run(){
        try{
            
            while(true){
                trafficControl.allowEast();
            }
            
        }catch(InterruptedException e){
            e.printStackTrace();
        }   
    }
}
