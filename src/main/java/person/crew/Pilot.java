package person.crew;

public class Pilot extends Crew {
    private String licenceNo;

    public Pilot(String name, String rank, String id) {
        super(name, rank);
        this.licenceNo = RankType.PILOT.getId() + id;
    }

    public String getLicenceNo() {
        return licenceNo;
    }
}
