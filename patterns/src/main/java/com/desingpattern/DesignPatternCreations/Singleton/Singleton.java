package com.desingpattern.DesignPatternCreations.Singleton;

public class Singleton {
    private static Singleton singleton;

    private Singleton(){
        System.out.println("creada una sola instancia");
    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void getMessage(){
        System.out.println("ha recibido un mensaje!");
    }
}
