package com.desingpattern.DesignPatternCreations.Prototype;

public class Vehiculo implements Cloneable {
    private final String marca;
    private final String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public Vehiculo clone() throws CloneNotSupportedException{
        try {
            return (Vehiculo) super.clone(); // Clona la instancia actual
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("No se puede clonar el objeto", e);
        }
    }

    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo);
    }
}
