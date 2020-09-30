import components.Wheel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WheelTest {
    private Wheel wheel;

    @Before
    public void before(){
        wheel = new Wheel("Winter");
    }

    @Test
    public void canGetWheelType(){
            assertEquals("Winter", wheel.getType());
    }
}
