import flight.Flight;
import flight.FlightManager;
import org.junit.Before;
import org.junit.Test;
import person.crew.CabinCrew;
import person.crew.Pilot;

import person.crew.RankType;
import person.passenger.Passenger;
import plane.Plane;
import plane.PlaneType;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Pilot pilot;
    CabinCrew cabinCrew1;
    Plane plane1;
    String destination;
    String departureAirport;
    Date departureTime;
    String flightNo;
    Passenger passenger1, passenger2, passenger3;
    FlightManager flightManagerInstance;


    @Before


//    public Flight(ArrayList<Crew> flyingCrew, ArrayList<Crew> cabinCrew, Plane plane, String flightNo, String destination, String departureAirport, String departureTime) {
    public void before() {
        plane1 = new Plane(PlaneType.BOEING.getType(), "123123X11", PlaneType.BOEING.getWeight(), new HashMap<Integer, String>() {{
            put(1, "EmptySeat");
            put(2, "EmptySeat");
            put(3, "EmptySeat");
            put(4, "EmptySeat");
            put(5, "EmptySeat");
            put(6, "EmptySeat");
            put(7, "EmptySeat");
            put(8, "EmptySeat");
            put(9, "EmptySeat");
            put(10, "EmptySeat");
        }});
        destination = "LND";
        departureAirport = "KHI";
        departureTime = new Date(2021, Calendar.AUGUST,11);
        flightNo = "KK132";
        pilot = new Pilot("Umair", RankType.PILOT.getType(), "23423423");
        cabinCrew1 = new CabinCrew("Asghar", RankType.AIRHOSTES.getType());
        passenger1 = new Passenger("Adam", 6);
        passenger2 = new Passenger("Ali", 2);
        passenger3 = new Passenger("Ahmed", 4);

        //        flight1 = new Flight(new ArrayList<Pilot>(Arrays.asList(pilot)), new ArrayList<CabinCrew>(Arrays.asList(cabinCrew1)), plane1, flightNo, destination, departureAirport, departureTime);
        //    }
        flight1 = new Flight(plane1, flightNo, destination, departureAirport, departureTime);
        flightManagerInstance = new FlightManager();
    }

    @Test
    public void pilotAssignedToFlight() {
        flight1.setFlyingCrew(new ArrayList<Pilot>(Arrays.asList(pilot)));
        flight1.setCabinCrew(new ArrayList<CabinCrew>(Arrays.asList(cabinCrew1)));

        assertEquals(false, flight1.getPilotInfo().contains("Umair1"));
        assertEquals(true, flight1.getPilotInfo().contains("Umair"));


    }

    @Test
    public void emptySeatsAvailable() {
        flight1.setFlyingCrew(new ArrayList<Pilot>(Arrays.asList(pilot)));
        flight1.setCabinCrew(new ArrayList<CabinCrew>(Arrays.asList(cabinCrew1)));
        flight1.getPlane().getEmptyPassengerSeats();
        assertEquals(10, flight1.getPlane().getEmptyPassengerSeats().size());


    }

    @Test
    public void PilotAllocatedToFlight() {
        flight1.setFlyingCrew(new ArrayList<Pilot>(Arrays.asList(pilot)));
        flight1.setCabinCrew(new ArrayList<CabinCrew>(Arrays.asList(cabinCrew1)));

        assertEquals("The pilot is about to fly the plane", flight1.pilotAvailableToFly());


    }

    @Test
    public void cabinCrewRelayMessage() {
        flight1.setFlyingCrew(new ArrayList<Pilot>(Arrays.asList(pilot)));
        flight1.setCabinCrew(new ArrayList<CabinCrew>(Arrays.asList(cabinCrew1)));
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);

        assertEquals("Welcome board to the all passengers", flight1.cabinCrewRelayMessage());


    }

    @Test
    public void passengerBooking() {
        flight1.setFlyingCrew(new ArrayList<Pilot>(Arrays.asList(pilot)));
        flight1.setCabinCrew(new ArrayList<CabinCrew>(Arrays.asList(cabinCrew1)));
        assertEquals(10, flight1.getPlane().getEmptyPassengerSeats().size());

        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);

        assertEquals(7, flight1.getPlane().getEmptyPassengerSeats().size());


    }

    @Test
    public void perPassengerBaggageAllowance() {


        assertEquals(5, flightManagerInstance.perPassengerBaggageAllowance(plane1));

    }

    @Test
    public void passengerBaggageWeight() {
        assertEquals("Access baggage will not be booked into the plane", flightManagerInstance.bookPassengerBaggage(plane1, passenger1));
        assertEquals("Bagged booked for passenger", flightManagerInstance.bookPassengerBaggage(plane1, passenger2));
    }

    @Test
    public void leftBaggageAllowance() {
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals(40, flightManagerInstance.leftBaggageAllowance(plane1));

    }

    @Test
    public void allocatedSeatNo() {
        flight1.setFlyingCrew(new ArrayList<Pilot>(Arrays.asList(pilot)));
        flight1.setCabinCrew(new ArrayList<CabinCrew>(Arrays.asList(cabinCrew1)));
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
        int reservedSeat = flight1.seachSeatForPassenger(passenger1);
        assertEquals(true, flight1.seatAlreadyBooked(reservedSeat));

    }


}
