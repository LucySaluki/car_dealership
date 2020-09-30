import components.Door;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoorTest {

    private Door door;

    @Before
    public void before(){
        door = new Door("Front left");
    }

    @Test
    public void canGetDoorType(){
        assertEquals("Front left", door.getType());
    }
}
