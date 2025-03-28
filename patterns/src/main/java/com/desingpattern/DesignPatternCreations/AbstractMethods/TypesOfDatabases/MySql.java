package com.desingpattern.DesignPatternCreations.AbstractMethods.TypesOfDatabases;

import com.desingpattern.DesignPatternCreations.AbstractMethods.interfaces.DBconnectionInterface;

public class MySql implements DBconnectionInterface{
    @Override
    public void connect(){
        System.out.println("se ha conectado a MySql!");
    }
}
