package com.ex08.test01;

public class Test_Vehicle {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();

        Vehicle car =new Car();
        car.start();
        car.stop();
    }
}
