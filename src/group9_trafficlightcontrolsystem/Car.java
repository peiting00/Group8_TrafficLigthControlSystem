/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author asus
 */
public class Car implements Runnable{
    
    TrafficModel tm ;
    TrafficLightControl trafficControl;
    private String from;
    
    public Car(TrafficLightControl trafficControl){
        this.trafficControl = trafficControl;
    }
    
    public void run(){
        int i=0;
        
        while(true){
            try {
                Thread.sleep(1000);
                String carID = generateCarPlateNumber();//generate CarID
                trafficControl.generateCarDirection(carID);
                i++;
            }catch(InterruptedException ex){
                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
      
       public String generateCarPlateNumber(){
        String randomPlate="";
        for(int i =0;i<3;i++){
            String[] alphabet = {"M","V","S","J","Q","A","B","C","D","E"};
            List<String> carAlphabet = new ArrayList<String>(Arrays.asList(alphabet));
            Random r = new Random();
            int randomNum = r.nextInt(carAlphabet.size());
            randomPlate = randomPlate.concat(carAlphabet.get(randomNum));
        }
        int num = (int)(Math.random()*9999);
        
        return randomPlate+num ;
    }
}
