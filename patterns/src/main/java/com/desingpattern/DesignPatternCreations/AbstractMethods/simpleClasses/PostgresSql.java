package com.desingpattern.DesignPatternCreations.AbstractMethods.simpleClasses;

import com.desingpattern.DesignPatternCreations.AbstractMethods.interfaces.ConnectInterface;

public class PostgresSql implements ConnectInterface{
    @Override
    public void connect(){
        System.out.println("Se ha conectado a PostgreSQl!");
    }
}
