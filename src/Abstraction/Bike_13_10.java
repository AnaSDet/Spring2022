package Abstraction;

public class Bike_13_10 {
    public static void main(String[] args) {
        Vehicle tw = new Bike("IDK", 3.2, 40, 4);

    }
}
abstract class Vehicle {
    private String brand;
    private double fuelCapacity;

    public Vehicle(String brand, double fuelCapacity) {
        this.brand = brand;
        this.fuelCapacity = fuelCapacity;
    }

    abstract void start();

    abstract void stop();

    double fuelEfficiency(double distanceTraveled, double fuelConsumed) {
        return distanceTraveled / fuelConsumed;
    }
}

abstract class TwoWheeler extends Vehicle {
    private double enginePower;

    public TwoWheeler(double enginePower) {
        super("Unknown", 0);
        this.enginePower = enginePower;
    }

    abstract void balance();

    double calculateMaxSpeed() {
        return 2.5 * enginePower;
    }
}

class Bike extends TwoWheeler {
    private int gears;

    public Bike(String brand, double fuelCapacity, double enginePower, int gears) {
        super(enginePower);
        this.gears = gears;
    }

    @Override
    void start() {
        System.out.println("Starting the bike...");
    }

    @Override
    void stop() {
        System.out.println("Stopping the bike...");
    }

    @Override
    void balance() {
        System.out.println("Balancing the bike...");
    }
}
