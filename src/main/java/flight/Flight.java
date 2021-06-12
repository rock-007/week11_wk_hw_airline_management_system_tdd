package flight;

import person.crew.Crew;
import person.passenger.Passenger;
import plane.Plane;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Crew> flyingCrew;
    private ArrayList<Crew> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList<Crew> flyingCrew, ArrayList<Crew> cabinCrew, Plane plane, String flightNo, String destination, String departureAirport, String departureTime) {
        this.flyingCrew = flyingCrew;
        this.cabinCrew = cabinCrew;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }
}
