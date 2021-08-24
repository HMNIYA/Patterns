package com.company.decoratorPattern;

class DecoratorPattern {
    public static void main(String[] args) {
        Tea simpleTea = new SimpleTea();
        Tea oloong = new Oolong(simpleTea);
        oloong.setTemperature(80);
    }
}

interface Tea{
    public void setTemperature(int arg);
}

class SimpleTea implements Tea{
    private int temperature = 100;

    @Override
    public void setTemperature(int arg) {
        System.out.println("Чай заваривается от " + arg + " градусов.");
    }
}

class Oolong implements Tea{
    private Tea tea;
    Oolong(Tea tea){
        this.tea = tea;
    }

    @Override
    public void setTemperature(int arg) {
        this.tea.setTemperature(arg);
    }
}