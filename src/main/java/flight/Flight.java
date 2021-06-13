package flight;

import person.crew.CabinCrew;
import person.crew.Crew;
import person.crew.Pilot;
import person.passenger.Passenger;
import plane.Plane;
import person.crew.RankType;

import java.util.ArrayList;

public class Flight {
    private ArrayList<? extends Crew> flyingCrew;
    private ArrayList<? extends Crew> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;

    //    public Flight(ArrayList<? extends Crew> flyingCrew, ArrayList<? extends Crew> cabinCrew, Plane plane, String flightNo, String destination, String departureAirport, String departureTime) {
    public Flight(Plane plane, String flightNo, String destination, String departureAirport, String departureTime) {
        this.flyingCrew = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<String> getPilotInfo() {
//        String[] pilotCollection = new String[2];
        ArrayList<String> pilotCollection = new ArrayList<>();
        for (Crew eachCrew : flyingCrew) {
            // if using ==eachCrew.getRank() == RankType.PILOT.getType() it will compare the referece
            if (eachCrew.getRank().equals(RankType.PILOT.getType())) {
                pilotCollection.add(eachCrew.getName());
            }

        }
        return pilotCollection;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setFlyingCrew(ArrayList<? extends Crew> pilots) {
        this.flyingCrew = pilots;
    }

    public void setCabinCrew(ArrayList<? extends Crew> cabinCrews) {
        this.cabinCrew = cabinCrews;
    }

    public void addPassenger(Passenger passenger) {
        if (plane.getEmptyPassengerSeats().size() > 0) {
            plane.setPassengerSeats(passenger.getName());
            passengers.add(passenger);
        }
    }

    public String pilotAvailableToFly() {
        String result;
        if (flyingCrew.size() > 0) {
            result = "The pilot is about to fly the plane";
        } else {
            result = "Assign the Pilot to the Flight first";
        }
        return result;
    }

    public String cabinCrewRelayMessage() {
        String result;
        if (cabinCrew.size() > 0) {
            result = "Welcome board to the all passengers";
        } else {
            result = "Assign the Cabin Crew to the Flight first";
        }
        return result;
    }

//    public void setPlane(Plane plane) {
//        this.plane = plane;
//    }
}
