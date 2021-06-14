package person.passenger;

import person.Person;


public class Passenger extends Person {
    private int noOfBags;
    private String flightNo = null;
    private int seatNo;


    public Passenger(String name, int noOfBags) {
        super(name);
        this.noOfBags = noOfBags;
        this.seatNo = -1;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public int getNoOfBags() {
        return noOfBags;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

}
