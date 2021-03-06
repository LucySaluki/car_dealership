package cars;

import components.Engine;
import components.Door;
import components.Seat;
import components.Wheel;

import java.util.ArrayList;

public class Petrol extends Car{
    public Petrol(String make, String model, String colour, double price, Engine engine, ArrayList<Wheel> wheel, ArrayList<Seat> seats, ArrayList<Door> doors) {
        super(make, model, colour, price, engine, wheel, seats, doors);
    }

    public String start() {
        return "Turn key to start";
    }

    public String lockCar() {
        return "Turn key to lock";
    }
}
