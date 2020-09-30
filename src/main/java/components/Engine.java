package components;

public class Engine {

    private double size;
    private int horsePower;
    private String engineType;
    private String fuelType;

    public Engine(double size, int horsePower, String engineType, String fuelType) {
        this.size = size;
        this.horsePower = horsePower;
        this.engineType = engineType;
        this.fuelType = fuelType;
    }

    public double getSize() {
        return size;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getFuelType() {
        return fuelType;
    }
}
