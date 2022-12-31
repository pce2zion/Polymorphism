package org.example;

public class Mitsubishi extends  Car{
    public Mitsubishi() {
    }

    public Mitsubishi(boolean hasEngine, Integer noOfCylinders, Integer noOfWheels, String name) {
        super(hasEngine, noOfCylinders, noOfWheels, name);
    }

    @Override
    public String toString() {
        return "Mitsubishi{} " + super.toString();
    }

    @Override
    public String startEngine() {
        return "Mitsubishi-> Start Engine";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi-> accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi-> brake";
    }
}
