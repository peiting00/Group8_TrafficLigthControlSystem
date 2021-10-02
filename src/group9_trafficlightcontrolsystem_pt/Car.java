/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem_pt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
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
    TrafficLightControl trafficControl;
    List<CarList> carList = new ArrayList<>();
    
    public Car(TrafficLightControl trafficControl){
        this.trafficControl = trafficControl;
    }
    
    public void run(){
        try {
            
            for (int count = 0; count <= 15; count++) 
            {
                    String from = generateCarDirection();
                    switch(from){
                        case("N"):
                            trafficControl.allowNorth(generateCarPlateNumber(from));
                            break;
                        case("S"):
                            trafficControl.allowSouth(generateCarPlateNumber(from));
                            break;
                        case("E"):
                            trafficControl.allowEast(generateCarPlateNumber(from));
                            break; 
                        case("W"):
                            trafficControl.allowWest(generateCarPlateNumber(from));
                            break;
                            
                    }
                    
          }
       
        }catch(InterruptedException ex){
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String generateCarDirection(){
    
    String[] carDirection = {"N","E","S","W"};
    ArrayList<String> carAvailableFrom = new ArrayList<String>(Arrays.asList(carDirection));
        
        String tempRemovedDirection = "";
        String from = "";
        String goTo = "";
        
            int randomIndex = (int)(Math.random()* carAvailableFrom.size());
            from = carAvailableFrom.get(randomIndex); //randomize where they came from (N, S, E, or W)
            //randomize where they want to go (N, S, E, or W), but excluding their current location
            carAvailableFrom.remove(from);
            int randomGoTo = (int)(Math.random()*carAvailableFrom.size());
            goTo = carAvailableFrom.get(randomGoTo);
            carAvailableFrom.add(from);//add back the direction

            //return "From: "+from+"GoTo: "+goTo;
            return from;
    }
            
            
   

     private String generateCarPlateNumber(String from){
        String randomPlate="";
        for(int i =0;i<3;i++){
            String[] alphabet = {"M","V","S","J","Q","A","B","C","D","E"};
            List<String> carAlphabet = new ArrayList<String>(Arrays.asList(alphabet));
            Random r = new Random();
            int randomNum = r.nextInt(carAlphabet.size());
            randomPlate = randomPlate.concat(carAlphabet.get(randomNum));
        }
        int num = (int)(Math.random()*9999);
        //carList.add(new CarList(trafficControl,randomPlate+num,from,goTo));
        carList.add(new CarList(trafficControl,randomPlate+num,from));
        
        System.out.println("@@ CarID: "+randomPlate+num+" From: "+from);
        
        return randomPlate+num ;
    }
}
