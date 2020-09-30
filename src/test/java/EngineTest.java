import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    private Engine engine;

    @Before
    public void before(){
        engine = new Engine(1.2, 110,"Combustion", "Petrol");
    }
    @Test
    public void canGetHorsePower(){
        assertEquals(110, engine.getHorsePower());
    }

    @Test
    public void canGetEngineType(){
        assertEquals("Combustion", engine.getEngineType());
    }

    @Test
    public void canGetFuelType(){
        assertEquals("Petrol", engine.getFuelType());
    }

    @Test
    public void canGetEngineSize(){
        assertEquals(1.2, engine.getSize(), 0.1);
    }
}
