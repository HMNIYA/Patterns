package com.company.singletonPattern;

public final class Singleton {
    public static volatile Singleton instance;
    public String str;

    private Singleton(String value){
        this.str = value;
    }

    public static Singleton getInstance(String str){
        Singleton result = instance;
        if(result != null){
            return result;
        }
        synchronized (Singleton.class){
            if (instance == null) {
                instance = new Singleton(str);
            }
        }
        return instance;
    }
}
