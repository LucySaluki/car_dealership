import cars.Diesel;
import cars.Electric;
import cars.Hybrid;
import cars.Petrol;
import components.Door;
import components.Engine;
import components.Seat;
import components.Wheel;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;

    private Petrol petrolCar;
    private Electric electricCar;

    private Wheel wheel;
    private Seat frontSeat;
    private Seat backSeat;
    private Door frontLeft;
    private Door frontRight;
    private Door backLeft;
    private Door backRight;
    private ArrayList<Wheel> wheels;
    private ArrayList<Door> doors;
    private ArrayList<Seat> fiveSeater;

    private Engine petrolEngine;
    private Engine electricEngine;

    @Before
    public void before() {
        customer = new Customer("Lucy", 50000.00);
        wheel = new Wheel("Winter");
        wheels = new ArrayList<Wheel>();
        wheels.add(wheel);
        wheels.add(wheel);
        wheels.add(wheel);
        wheels.add(wheel);

        frontLeft = new Door("Front left");
        frontRight = new Door("Front right");
        backLeft = new Door("Back left");
        backRight = new Door("Back right");
        doors = new ArrayList<Door>();
        doors.add(frontLeft);
        doors.add(frontRight);
        doors.add(backRight);
        doors.add(backLeft);

        frontSeat = new Seat("Front");
        backSeat = new Seat("Back");
        fiveSeater = new ArrayList<Seat>();
        fiveSeater.add(frontSeat);
        fiveSeater.add(frontSeat);
        fiveSeater.add(backSeat);

        petrolEngine = new Engine(1.2, 110, "Combustion", "Petrol");
        electricEngine = new Engine(1.0, 350, "Electric", "Battery");

        petrolCar = new Petrol("VW", "Polo",  "Red", 5000.00, petrolEngine, wheels, fiveSeater, doors);
        electricCar = new Electric("Tesla","Roadster",  "Green", 145000.00, electricEngine, wheels, fiveSeater, doors);
    }

    @Test
    public void canGetName(){
        assertEquals("Lucy", customer.getName());
    }

    @Test
    public void canGetWallet(){
        assertEquals(50000.00, customer.getWallet(),0.01);
    }

    @Test
    public void customerStartsWithNoCars(){
        assertEquals(0, customer.getCars().size());
    }

    @Test
    public void canAddCar(){
        customer.addCar(petrolCar);
        assertEquals(1, customer.getCars().size());
    }

    @Test
    public void canRemoveCar(){
        customer.addCar(petrolCar);
        customer.removeCar(petrolCar);
        assertEquals(0, customer.getCars().size());
    }

    @Test
    public void canAddWallet(){
        customer.addToWallet(10000.00);
        assertEquals(60000.00, customer.getWallet(),0.01);
    }

    @Test
    public void canRemoveFromWallet(){
        customer.removeFromWallet(30000.00);
        assertEquals(20000.00, customer.getWallet(),0.01);
    }
}
