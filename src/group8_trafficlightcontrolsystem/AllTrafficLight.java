/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group8_trafficlightcontrolsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author user
 */
public class AllTrafficLight extends Thread{
    
    TrafficModel tm;
    TrafficLightControl trafficControl;
    
    public AllTrafficLight(TrafficLightControl trafficControl, TrafficModel tm){
        this.trafficControl = trafficControl;
        this.tm = tm;
        
        System.out.println("*********** WELCOME TO BOWEI & PEITING TRAFFIC LIGHT CONTROL SYSTEM ***********");
        System.out.println("* This a 4 junctions traffic light control system. ");
        System.out.println("********************************************************************************\n");
    }
    
    public void run(){
        int currentIndex = 0; //North
        try{
            while(true){
                int durationForGreen = 6000;
                ArrayList<Integer> queuesSize = trafficControl.allowDirectionByTimer();
                
                if(currentIndex != 4){
                    int sumAllQueuesSize = 0;
                    queuesSize.remove(queuesSize.get(4));
                    
                    for (int i = 0; i < queuesSize.size(); i++) 
                        sumAllQueuesSize += queuesSize.get(i);

                    int average = sumAllQueuesSize / 4;

                    int currentQueueSize = queuesSize.remove(currentIndex);
                    
                    int sumQueueSizeLowerThanAvg = 0;
                    
                    int removeTime = 0;
                    
                    if(currentQueueSize > average){
                        boolean noNeedExtension = false;
                        
                        for (int i = 0; i < queuesSize.size(); i++) {
                            if(queuesSize.get(i) > average){
                                queuesSize.remove(i);

                                if(++removeTime > 1){
                                    noNeedExtension = true;
                                    break;
                                }
                            }
                            else{
                                sumQueueSizeLowerThanAvg += queuesSize.get(i);
                            }
                        }
                        
                        if(!noNeedExtension){
                            int avgLeft = sumQueueSizeLowerThanAvg / queuesSize.size();
                            if(currentQueueSize - avgLeft > 20){
                                durationForGreen += 20000;
                            }
                            else if(currentQueueSize - avgLeft > 10){
                                durationForGreen += 10000;
                            }
                        }
                    }
                }
                else{
                    durationForGreen = 11000;
                }
            
                                
                currentIndex = (currentIndex + 1) % 5;
                
                Timing timingGreen = new Timing (durationForGreen, tm);
                timingGreen.start();
                System.out.println("Timing: " + ((durationForGreen/1000)-1) + " second(s) left");
                Thread.sleep(durationForGreen); 
                
                trafficControl.setWhichDirectionToYellow();
                Timing timingYellow = new Timing (4000, tm);
                timingYellow.start();
                Thread.sleep(4000); 
                
                trafficControl.setWhichDirectionToRed();
                Timing timingRed = new Timing (3000, tm);
                timingRed.start();
                Thread.sleep(3000);
            }
            
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
    
    
}