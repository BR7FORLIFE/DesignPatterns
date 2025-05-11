package com.desingpattern.DesignPatternCreations.AbstractMethods.simpleClasses;

import com.desingpattern.DesignPatternCreations.AbstractMethods.interfaces.ConnectInterface;

public class MySql implements ConnectInterface {
    @Override
    public void connect(){
        System.out.println("conectado a MySql!");
    }
}
