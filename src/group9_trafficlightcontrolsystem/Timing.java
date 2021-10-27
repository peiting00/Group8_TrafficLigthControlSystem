/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class Timing extends Thread{
    TrafficModel tm;
    int timing = 0;
    
    public Timing(int timing, TrafficModel tm){
        this.timing = timing;
        this.tm = tm;
    }
    
    public void run(){
        while(timing > 0){
            tm.setTiming(timing/1000);
            timing -= 1000;
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Timing.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
