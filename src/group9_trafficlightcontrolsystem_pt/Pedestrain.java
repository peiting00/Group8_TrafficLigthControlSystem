/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem_pt;

/**
 *
 * @author asus
 */
public class Pedestrain extends Thread{
    TrafficLightControl trafficControl;
    
    public Pedestrain(TrafficLightControl tc){
        trafficControl=tc;
    }
    
    public void run(){
        
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    
    }
}
