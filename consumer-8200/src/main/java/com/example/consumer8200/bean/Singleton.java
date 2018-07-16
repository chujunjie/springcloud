package com.example.consumer8200.bean;

public class Singleton {

    //饿汉式
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() throws Exception{
        return instance;
    }

}

