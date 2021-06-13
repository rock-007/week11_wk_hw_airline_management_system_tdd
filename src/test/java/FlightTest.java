import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import person.crew.CabinCrew;
import person.crew.Pilot;
import person.crew.RankType;

import java.util.ArrayList;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrew cabinCrew1;

    @Before

    public void before() {
        pilot = new Pilot("Umair", RankType.PILOT.getType(), "23423423");
        cabinCrew1 = new CabinCrew("Asghar", RankType.AIRHOSTES.getType());
        flight = new Flight(new ArrayList() {
            {
                pilot;
                cabinCrew1;
            }
        });
    }

    @Test
    public void test() {

    }

}
