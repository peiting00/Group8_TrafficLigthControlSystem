/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author user
 */
public class AllTrafficLight extends Thread{
    
    TrafficLightControl trafficControl;
    
    public AllTrafficLight(TrafficLightControl trafficControl){
        this.trafficControl = trafficControl;
        System.out.println("*********** WELCOME TO BOWEI & PEITING TRAFFIC LIGHT CONTROL SYSTEM ***********");
        System.out.println("* This a 4 junctions traffic light control system. ");
        System.out.println("* Scenario 1: ");
        System.out.println("********************************************************************************\n");
    }
    
    public void run(){
        try{
            while(true){
                
                trafficControl.allowDirectionByTimer();
                Thread.sleep(10000); 
                
                trafficControl.setWhichDirectionToYellow();
                Thread.sleep(3000); 
                
                trafficControl.setWhichDirectionToRed();
                Thread.sleep(3000);
            }
            
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
    
    
}