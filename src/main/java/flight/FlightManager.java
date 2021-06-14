package flight;

import person.passenger.Passenger;
import plane.Plane;

public class FlightManager {
    public FlightManager() {
    }

    public String bookPassengerBaggage(Plane plane, Passenger passenger) {
        int perPassengerBaggageAllowance = this.perPassengerBaggageAllowance(plane);
        int totalPassengerBaggageWeight = this.passengerBaggageWeight(passenger);
        if (totalPassengerBaggageWeight <= perPassengerBaggageAllowance) {
            return "Bagged booked for passenger";
        } else {
            return "Access baggage will not be booked into the plane";

        }
    }

    public int perPassengerBaggageAllowance(Plane plane) {
        int totalPassengerAllowance = plane.getPlaneWeight() / 2;
        int totalNoOfSeats = plane.getPassengerSeats().size();
        return totalPassengerAllowance / totalNoOfSeats;
    }


    private int passengerBaggageWeight(Passenger passenger) {
        int eachBaggageWeightKg = 1;
        int noOfBaggages = passenger.getNoOfBags();
        return eachBaggageWeightKg * noOfBaggages;
    }

    public int leftBaggageAllowance(Plane plane) {
        int emptySeats = plane.getEmptyPassengerSeats().size();
        return emptySeats * perPassengerBaggageAllowance(plane);
    }
}
