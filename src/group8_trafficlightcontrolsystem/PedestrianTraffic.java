/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group8_trafficlightcontrolsystem;

/**
 *
 * @author asus
 */
public class PedestrianTraffic extends Thread{
    TrafficLightControl trafficControl;
    
    public PedestrianTraffic(TrafficLightControl tc){
        trafficControl=tc;
    }
    
    public void run(){
        try{
            while(true){
                trafficControl.allowPedestrian();
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    
    }
}
