package com.srini;

public class EnacpExample {
    public static void main(String[] orgs){
Car car = new Car();
car.setName("Jeep");
car.setName("Honda");
car.setTopSpeed(150);

System.out.println(car.getName() + " top speed in MPH " + car.getTopSpeed());
System.out.println(car.getName() + " top speed in KPH " + car.getTopSpeedKHM());
    }
}
