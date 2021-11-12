/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group8_trafficlightcontrolsystem;

/**
 *
 * @author user
 */
public class SouthTraffic extends Thread{
     TrafficLightControl trafficControl;
     TrafficModel tm;
    
    public SouthTraffic(TrafficLightControl trafficControl, TrafficModel tm){
        this.trafficControl = trafficControl;
        this.tm = tm;
    }
    
    public void run(){
        try{
            
            while(true){
                CarInfo carLeft = trafficControl.allowSouth();
                Thread.sleep(1000);
                
                if(carLeft != null){
                    CarMovement movement = new CarMovement(carLeft.getFrom(), carLeft.getGoTo(), tm);
                    movement.start();
                }
            }   
        }catch(InterruptedException e){
            e.printStackTrace();
        }   
    }
}
