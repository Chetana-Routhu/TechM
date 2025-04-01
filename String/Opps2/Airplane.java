package Opps2;

import java.util.*;

public class Airplane {
     String flightNumber; 
    	 String destination;
     String departureTime;
    
    
    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public void FlightStatus() {
        System.out.println("Flight " + flightNumber + " to " + destination + "at  "+departureTime);
    }

    public void Delay(String newdepartureTime ) {
    	departureTime = newdepartureTime;
    	System.out.println("Flight " + flightNumber + " to " + destination + " delayed at  "+newdepartureTime);
    	
    }

    public static void main(String[] args) {
        Airplane flight = new Airplane("C123", "Vizag", "14:30");
        flight.FlightStatus();
        flight.Delay("12:34");
    }
}
