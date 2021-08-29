package com.company.statePattern2;

public class Main {


    public static void main(String[] args) {
//        Context context = new Context(new LowerCaseStat(), "Yegor");
//        context.doAction();
//        context.setCalculate(new UpperCaseStat());
//        context.doAction();
        int a = 1, b = 5;
        Calulator calc = new Calulator(new Subtraction(), a, b);
        calc.doAction();

    }
}

interface Calculate {
    void calculate(int a, int b);
}

class Sum implements Calculate {
    @Override
    public void calculate(int a, int b) {
        System.out.println(a+b);
    }
}

class Subtraction implements Calculate {
    @Override
    public void calculate(int a, int b) {
        System.out.println(a-b);
    }
}

class Multiplication implements Calculate {
    @Override
    public void calculate(int a, int b) {
        System.out.println(a*b);
    }
}

class Division implements Calculate {
    @Override
    public void calculate(int a, int b) {
        System.out.println(a/b);
    }
}

class Calulator{
    Calculate calculate;
    int a;
    int b;

    public Calulator(Calculate calculate, int a, int b) {
        this.calculate = calculate;
        this.a = a;
        this.b = b;
    }

    public void setCalculate(Calculate Calculate) {
        this.calculate = Calculate;
    }

    void doAction(){
        calculate.calculate(this.a, this.b);
    }
}