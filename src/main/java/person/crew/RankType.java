package person.crew;

public enum RankType {

    PILOT("Pilot", "PilotNo."),
    AIRHOSTES("Airhostes", "AirHostesNo."),
    INFLIGHTMANAGER("InFlightManager", "FlightManagerNo.");

    RankType(String rank, String id) {
        this.rank = rank;
        this.id = id;
    }

    private final String rank;
    private final String id;

    public String getType() {
        return rank;
    }

    public String getId() {
        return id;
    }
}
