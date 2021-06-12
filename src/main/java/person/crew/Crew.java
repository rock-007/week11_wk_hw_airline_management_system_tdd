package person.crew;

import person.Person;

public abstract class Crew extends Person {
    private String rank;

    public Crew(String name, String rank) {
        super(name);
        this.rank = rank;

    }

    public String getRank() {
        return rank;
    }
}
