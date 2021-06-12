import org.junit.Before;
import org.junit.Test;
import person.crew.CabinCrew;
import person.crew.RankType;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

CabinCrew cabincrew;
    @Before

    public void before() {
cabincrew = new CabinCrew("Asghar", RankType.AIRHOSTES.getType());
    }

    @Test
    public void getRankType() {
        assertEquals("Airhostes",cabincrew.getRank());

    }

}
