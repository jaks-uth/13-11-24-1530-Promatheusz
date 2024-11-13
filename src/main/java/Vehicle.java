package pl.example.vehicles;

public class Vehicle extends pl.example.vehicles.Vehicle {

    private int wheels;

    public Vehicle(String name) {
        super(name);
        this.wheels = wheels;
    }

    @Override
    public int getMaxSpeed() {
        return 50;
    }
    public int getWheels() {
        return wheels;
    }

}
