/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem_bw;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author user
 */
public class AllTrafficLight extends Thread{
    
    TrafficLightControl trafficControl = new TrafficLightControl();
    
    public AllTrafficLight(TrafficLightControl trafficControl){
        this.trafficControl = trafficControl;
    }
    
    public void run(){
        try{
            while(true){
                trafficControl.allowDirectionByTimer();
                TimeUnit.SECONDS.sleep(5);
            }
            
//            for (int i = 0; i < 10; i++) {
//                control.goNorth();
//                Thread.sleep(2000);
//                
//                control.goSouth();
//                Thread.sleep(2000);
//                
//                control.goWest();
//                Thread.sleep(2000);
//                
//                control.goEast();  
//                Thread.sleep(2000);
//                
//                control.goPedestrain();
//                Thread.sleep(2000);
//            }
//            
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
    
}