/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem;

/**
 *
 * @author asus
 */
public class PedestrainTraffic extends Thread{
    TrafficLightControl trafficControl;
    
    public PedestrainTraffic(TrafficLightControl tc){
        trafficControl=tc;
    }
    
    public void run(){
        try{
            while(true){
                trafficControl.allowPedestrain();
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    
    }
}
