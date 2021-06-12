import org.junit.Before;
import org.junit.Test;
import person.crew.Pilot;
import person.crew.RankType;

import static org.junit.Assert.assertEquals;

public class PilotTest {


    Pilot pilot;

    @Before

    public void before() {
    pilot = new Pilot("Umair", RankType.PILOT.getType(),"11");
    }

    @Test
    public void getRankType() {
        assertEquals("Pilot",pilot.getRank());

    }

}
