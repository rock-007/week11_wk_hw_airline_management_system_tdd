package plane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Plane {
    private String planeType;
    private String planeId;
    private int planeWeight;
    private HashMap<Integer, String> passengerSeats;

    public Plane(String planeType, String planeId, int planeWeight, HashMap<Integer, String> passengerSeats) {
        this.planeType = planeType;
        this.planeId = planeId;
        this.planeWeight = planeWeight;
        this.passengerSeats = passengerSeats;
    }

    public String getPlaneId() {
        return planeId;
    }

    public HashMap<Integer, String> getPassengerSeats() {
        return passengerSeats;
    }

    public int getPlaneWeight() {
        return planeWeight;
    }

    public String getPlaneType() {
        return planeType;
    }

    public ArrayList<Integer> getEmptyPassengerSeats() {
        ArrayList<Integer> emptySeatsNo = new ArrayList<>();
        for (HashMap.Entry<Integer, String> passengerSeat : passengerSeats.entrySet()) {
            if (passengerSeat.getValue().equals("EmptySeat")) {
                emptySeatsNo.add(passengerSeat.getKey());
            }
        }
        return emptySeatsNo;
    }

    public void setPassengerSeats(String passengerName) {
        for (HashMap.Entry<Integer, String> passengerSeat : passengerSeats.entrySet()) {
            if (passengerSeat.getValue().equals("EmptySeat")) {
                passengerSeat.setValue(passengerName);
                break;
            }
        }
    }


    public int searchPassengerSeats(String name) {

        int seatNo = -1;
        for (HashMap.Entry<Integer, String> passengerSeat : passengerSeats.entrySet()) {
            if (passengerSeat.getValue().equals(name)) {
                seatNo = passengerSeat.getKey();
                break;
            }
        }
        return seatNo;
    }
}
