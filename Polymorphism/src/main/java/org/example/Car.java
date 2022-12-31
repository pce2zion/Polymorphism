package org.example;

public class Car {
    private boolean hasEngine;
    private Integer noOfCylinders;
    private Integer noOfWheels;
    private String name;

    public Car() {
    }

    public Car(boolean hasEngine, Integer noOfCylinders, Integer noOfWheels, String name) {
        this.hasEngine = true;
        this.noOfCylinders = noOfCylinders;
        this.noOfWheels = 4;
        this.name = name;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public Integer getNoOfCylinders() {
        return noOfCylinders;
    }

    public void setNoOfCylinders(Integer noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }

    public Integer getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(Integer noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hasEngine=" + hasEngine +
                ", noOfCylinders=" + noOfCylinders +
                ", noOfWheels=" + noOfWheels +
                ", name='" + name + '\'' +
                '}';
    }

    public String startEngine(){
        return "Car-> Start Engine";
    }

    public String accelerate(){
        return "Car-> accelerate";
    }

    public String brake(){
        return "Car-> brake";
    }
}
