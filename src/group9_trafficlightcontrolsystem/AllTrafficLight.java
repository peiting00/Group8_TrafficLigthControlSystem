/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem;

import java.util.ArrayList;
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
        int currentIndex = 0; //North
        try{
            while(true){
                int durationForGreen = 5000;
                ArrayList<Integer> queuesSize = trafficControl.allowDirectionByTimer();
                
                if(currentIndex != 4){
                    int sumAllQueuesSize = 0;

                    for (int i = 0; i < queuesSize.size()-1; i++) 
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
                            if(currentQueueSize - avgLeft > 10){
                                durationForGreen = 10000;
                            }
                        }
                    }
                }
                else{
                    durationForGreen = 10000;
                }
               
                
                
                
//                switch(currentIndex){
//                    case 0: //North
//                        
//                        break;
//                    case 1: //South
//                        break;
//                    case 2: //East
//                        break;
//                    case 3: //West
//                        break;
//                    case 4: //Pedestrian
//                        durationForGreen = 7000;
//                        break;
//                }
                                
                currentIndex = (currentIndex + 1) % queuesSize.size();
                
                Thread.sleep(durationForGreen); 
                
                trafficControl.setWhichDirectionToYellow();
                Thread.sleep(3000); 
                
                trafficControl.setWhichDirectionToRed();
                Thread.sleep(2000);
            }
            
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
    
    
}