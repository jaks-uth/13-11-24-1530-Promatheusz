package pl.example.vehicles;

public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        super(name);
    }

    @Override
    public abstract int getMaxSpeed() {
        return 50;
    }
    public String getName() {
        return name;
    }

}
