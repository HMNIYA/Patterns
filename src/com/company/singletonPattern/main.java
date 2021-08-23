package com.company.singletonPattern;

public class main {
    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance("hello");
//        Singleton anotherSingleton = Singleton.getInstance("world");
//        System.out.println(singleton.str);
//        System.out.println(singleton.str);

        SingletonEnum singleton = SingletonEnum.INSTANCE;
        singleton.print();
    }
}
