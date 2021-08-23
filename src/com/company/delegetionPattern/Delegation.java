package com.company.delegetionPattern;

public class Delegation {
    public static void main(String[] args) {
        final String RIDER = "Tom";
        CarController bmw = new CarController(new BMWCar());
        CarController mercedes = new CarController(new MercedesCar());
        CarController volvo = new CarController(new VolvoCar());
        bmw.ride(RIDER);
        mercedes.ride(RIDER);
        volvo.ride(RIDER);
    }
}

interface Car{
    public void ride(String name);
}

class CarController implements Car{
    private final Car car;
    public CarController(Car car){
        this.car = car;
    }

    @Override
    public void ride(String name) {
        car.ride(name);
    }
}

class BMWCar implements Car{
    @Override
    public void ride(String name) {
        System.out.println(name + " rides in BMW");
    };
}

class MercedesCar implements Car{
    @Override
    public void ride(String name) {
        System.out.println(name + " rides in Mercedes");
    };
}

class VolvoCar implements Car{
    @Override
    public void ride(String name) {
        System.out.println(name + " rides in Volvo");
    };
}
