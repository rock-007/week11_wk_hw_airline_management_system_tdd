package person.passenger;

import person.Person;


public class Passenger extends Person {
    private int noOfBags;

    public Passenger(String name, int noOfBags) {
        super(name);
        this.noOfBags = noOfBags;
    }
}
