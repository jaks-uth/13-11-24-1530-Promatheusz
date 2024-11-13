package pl.example.vehicles;
// TODO: Implement the Bike class
public class Bike extends pl.example.vehicles.Vehicle {

    public Bike(String name) {
        super(name);
    }

    @Override
    public int getMaxSpeed() {
        return 50;
    }
}