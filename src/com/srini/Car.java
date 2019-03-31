package com.srini;

public class Car {
    String name;
    double topSpeed;

    public Car(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
    public double getTopSpeedKHM(){
        return topSpeed * 1.60;
    }
}
