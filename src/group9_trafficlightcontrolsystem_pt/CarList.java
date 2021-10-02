/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem_pt;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CarList extends Thread{
    TrafficLightControl trafficControl;
    
    private String carID;
    private String from;
    private String goTo;
    
    //public CarList(TrafficLightControl trafficControl, String carID, String from, String goTo){
    public CarList(TrafficLightControl trafficControl, String carID, String from,String goTo){
        this.carID = carID;
        this.trafficControl = trafficControl;
        this.from = from;
        this.goTo = goTo;
        
    }
    
    public String getCarID(){
        return carID;
    }
    
    public String getFrom(){
        return from;
    }
    
    public String goTo(){
        return goTo;
    }
    
    public String getCarInfo(){
        return "CarID: "+carID+" from: "+from+" go to: "+goTo;
    }
   
}
