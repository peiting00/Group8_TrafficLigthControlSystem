/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group8_trafficlightcontrolsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CarInfo extends Thread{
    String[] carDirection = {"N", "E", "S", "W"};//available directions
    ArrayList<String> carAvailableFrom = new ArrayList<String>(Arrays.asList(carDirection));
    
    private String carID;
    private String from;
    private String goTo;
    
    //public CarList(TrafficLightControl trafficControl, String carID, String from, String goTo){
    public CarInfo(String from){
        carID = generateCarPlateNumber();
        this.from = from;
        generateCarDirection(from);
    }
    
    public String getCarID(){
        return carID;
    }
    
    public String getFrom(){
        return from;
    }
    
    public String getGoTo(){
        return goTo;
    }
    
    /***************************************************************
    * To generate car with random car plate number
    * ***************************************************************/       
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
    
    public void generateCarDirection(String from){
        //randomize where they want to go (N, S, E, or W), but excluding their current location
        carAvailableFrom.remove(from);
        int randomGoTo = (int) (Math.random() * carAvailableFrom.size());
        goTo = carAvailableFrom.get(randomGoTo);

        carAvailableFrom.add(from);//add back the direction
    }   
}
