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
 * @author user
 */
public class CarList extends Thread{
    private String carID;
    private String from;
    private String goTo;
    
    //public CarList(TrafficLightControl trafficControl, String carID, String from, String goTo){
    public CarList(String carID, String from, String goTo){
        this.carID = carID;
        this.from = from;
        this.goTo = goTo;
    }
    
//    public void setCarID(String carID){
//        this.carID = carID;
//    }
//    
    public void setFrom(String from){
        this.from = from;
    }
    
    public void setGoTo(String goTo){
        this.goTo = goTo;
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
//    
//    public String getCarInfo(){
//        return "CarID "+carID+" FROM "+from+" GO TO "+goTo;
//    }
   
}
