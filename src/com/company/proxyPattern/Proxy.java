package com.company.proxyPattern;

public class Proxy {
    public static void main(String[] args) {
        Car car = new CarProxy();
        car.drive();
    }
}

interface Car {
    void drive();
}

class CarProxy implements Car {
    Car car = new Reno();
    @Override
    public void drive() {
        System.out.println("proxy is working.");
        car.drive();
    }
}

class Reno implements Car {
    @Override
    public void drive() {
        System.out.println("drive reno.");
    }
}

