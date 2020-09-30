package cars;

import components.Engine;
import components.Door;
import components.Seat;
import components.Wheel;

import java.util.ArrayList;

public abstract class Car {
    private String make;
    private String model;
    private String colour;
    private double price;
    private Engine engine;
    private ArrayList<Wheel> wheels;
    private ArrayList<Seat> seats;
    private ArrayList<Door> doors;

    public Car(String make, String model, String colour, double price, Engine engine,
               ArrayList<Wheel> wheel, ArrayList<Seat> seats, ArrayList<Door> doors) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.engine = engine;
        this.wheels = wheel;
        this.seats = seats;
        this.doors = doors;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ArrayList<Wheel> getWheel() {
        return wheels;
    }

    public void setWheel(ArrayList<Wheel> wheel) {
        this.wheels = wheel;
    }

    public void setWheelAt(int index, Wheel wheel){
        this.wheels.set(index, wheel);
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public void setSeatAt(int index, Seat seat){
        this.seats.set(index, seat);
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public void setDoors(ArrayList<Door> doors) {
        this.doors = doors;
    }

    public void setSeatAt(int index, Door door){
        this.doors.set(index, door);
    }

    public abstract String start();

    public abstract String lockCar();
}
