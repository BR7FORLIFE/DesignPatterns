package com.desingpattern.DesignPatternCreations.AbstractMethods.Factorys;

import com.desingpattern.DesignPatternCreations.AbstractMethods.TypesOfDatabases.MySql;
import com.desingpattern.DesignPatternCreations.AbstractMethods.interfaces.AbstractFactoryInterfaceDB;
import com.desingpattern.DesignPatternCreations.AbstractMethods.interfaces.DBconnectionInterface;

public class MySqlFactory implements AbstractFactoryInterfaceDB{
    @Override
    public DBconnectionInterface createConnection(){
        return new MySql();
    }
}
