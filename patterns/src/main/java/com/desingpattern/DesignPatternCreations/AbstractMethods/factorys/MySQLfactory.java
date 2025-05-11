package com.desingpattern.DesignPatternCreations.AbstractMethods.factorys;

import com.desingpattern.DesignPatternCreations.AbstractMethods.globalInterface.GlobalInterface;
import com.desingpattern.DesignPatternCreations.AbstractMethods.interfaces.ConnectInterface;
import com.desingpattern.DesignPatternCreations.AbstractMethods.simpleClasses.MySql;

public class MySQLfactory implements GlobalInterface{
    @Override
    public ConnectInterface connectInterface(){
        return new MySql();
    }
}
