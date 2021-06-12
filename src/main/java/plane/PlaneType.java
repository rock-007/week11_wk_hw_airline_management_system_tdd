package plane;

public enum PlaneType {

    BOEING("Boeing", 100),
    AIRBUS("747", 50);

    private final String type;
    private final int weight;


    PlaneType(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }
}
