import cars.Car;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private ArrayList<Car> stock;
    private ArrayList<Customer> customers;
    private double till;

    public Dealership(String name, double till){
        this.name=name;
        this.till = till;
        this.stock = new ArrayList<Car>();
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public double getTill() {
        return till;
    }


}
