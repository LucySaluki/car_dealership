
import components.Door;
import components.Seat;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatTest {
    private Seat seat;

    @Before
    public void before(){
        seat = new Seat("Front");
    }

    @Test
    public void canGetSeatType(){
        assertEquals("Front", seat.getType());
    }
}
