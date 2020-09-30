import cars.Car;

import java.util.ArrayList;

public class Customer {

    //Attributes/properties
    private String name;
    private double wallet;
    private ArrayList<Car>  cars;

    //Constructor
    public Customer(String name, double wallet){
        this.name=name;
        this.wallet=wallet;
        this.cars= new ArrayList<Car>();
    }
    //Methods
    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addToWallet(double amount){
        this.wallet += amount;
    }

    public void removeFromWallet(double amount){
        this.wallet -= amount;
    }

    public void addCar(Car car){
        this.cars.add(car);
    }
    public void removeCar(Car car){
        this.cars.remove(car);
    }
}
