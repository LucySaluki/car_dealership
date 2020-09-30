import cars.*;
import components.Door;
import components.Engine;
import components.Seat;
import components.Wheel;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Petrol petrolCar;
    private Electric electricCar;
    private Hybrid hybridCar;
    private Diesel dieselCar;

    private Wheel wheel;
    private Seat frontSeat;
    private Seat backSeat;
    private Door frontLeft;
    private Door frontRight;
    private Door backLeft;
    private Door backRight;
    private ArrayList<Wheel> wheels;
    private ArrayList<Door> doors;
    private ArrayList<Seat> twoSeater;
    private ArrayList<Seat> fiveSeater;

    private Engine petrolEngine;
    private Engine dieselEngine;
    private Engine hybridEngine;
    private Engine electricEngine;

    @Before
    public void before(){
        wheel = new Wheel("Winter");
        wheels = new ArrayList<Wheel>();
        wheels.add(wheel);
        wheels.add(wheel);
        wheels.add(wheel);
        wheels.add(wheel);

        frontLeft= new Door("Front left");
        frontRight= new Door("Front right");
        backLeft= new Door("Back left");
        backRight= new Door("Back right");
        doors = new ArrayList<Door>();
        doors.add(frontLeft);
        doors.add(frontRight);
        doors.add(backRight);
        doors.add(backLeft);

        frontSeat=new Seat("Front");
        backSeat = new Seat("Back");
        fiveSeater=new ArrayList<Seat>();
        fiveSeater.add(frontSeat);
        fiveSeater.add(frontSeat);
        fiveSeater.add(backSeat);

        twoSeater=new ArrayList<Seat>();
        twoSeater.add(frontSeat);
        twoSeater.add(frontSeat);

        petrolEngine = new Engine(1.2, 110, "Combustion", "Petrol");
        dieselEngine = new Engine(1.5, 200, "Combustion", "Diesel");
        hybridEngine = new Engine(1.3, 220, "Hybrid", "Battery/Petrol");
        electricEngine = new Engine(1.0, 350, "Electric", "Battery");

        petrolCar = new Petrol("VW", "Polo",  "Red", 5000.00, petrolEngine, wheels, fiveSeater, doors);
        dieselCar = new Diesel("Audi","A3",  "Black", 24000.00, dieselEngine, wheels, fiveSeater, doors);
        hybridCar = new Hybrid("Toyota","Prius",  "Silver", 20000.00, hybridEngine, wheels, fiveSeater, doors);
        electricCar = new Electric("Tesla","Roadster",  "Green", 145000.00, electricEngine, wheels, twoSeater, doors);
    }

    @Test
    public void canGetModel(){
        assertEquals("Polo", petrolCar.getModel());
    }
    @Test
    public void canGetMake(){
        assertEquals("Audi",dieselCar.getMake());
    }

    @Test
    public void carHasWheels(){
        assertEquals(4, petrolCar.getWheel().size());
    }

    @Test
    public void carHasEngine(){
        assertEquals(petrolEngine, petrolCar.getEngine());
    }

    @Test
    public void carHasDoors(){
        assertEquals(4, petrolCar.getDoors().size());
    }

    @Test
    public void carHasSeats(){
        assertEquals(3, petrolCar.getSeats().size());
    }

    @Test
    public void carCanStart(){
        assertEquals("Keyless start", electricCar.start());
    }
    @Test
    public void carCanBeLocked(){
        assertEquals("Central locking", electricCar.lockCar());
    }

}
