package cars;

import components.Engine;
import components.Door;
import components.Seat;
import components.Wheel;

import java.util.ArrayList;

public class Electric extends Car {
    public Electric(String make, String model, String colour, double price, Engine engine, ArrayList<Wheel> wheel, ArrayList<Seat> seats, ArrayList<Door> doors) {
        super(make, model, colour, price, engine, wheel, seats, doors);
    }

    public String start() {
        return "Keyless start";
    }

    public String lockCar() {
        return "Central locking";
    }
}
