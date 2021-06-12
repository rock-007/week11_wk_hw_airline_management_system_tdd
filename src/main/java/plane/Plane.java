package plane;

public class Plane {
    private PlaneType planeType;
    private PlaneType planeId;

    public Plane(PlaneType planeType, PlaneType planeId) {
        this.planeType = planeType;
        this.planeId = planeId;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }
}
