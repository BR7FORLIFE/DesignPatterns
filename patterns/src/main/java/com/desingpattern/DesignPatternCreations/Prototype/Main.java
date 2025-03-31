package com.desingpattern.DesignPatternCreations.Prototype;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("cherolevt", "201");
        Vehiculo vehiculo2 = vehiculo.clone();
        
        System.out.println(vehiculo == vehiculo2);
    }
}