package com.desingpattern.DesignPatternCreations.AbstractMethods.Factorys;

import com.desingpattern.DesignPatternCreations.AbstractMethods.TypesOfDatabases.PostgreSql;
import com.desingpattern.DesignPatternCreations.AbstractMethods.interfaces.AbstractFactoryInterfaceDB;
import com.desingpattern.DesignPatternCreations.AbstractMethods.interfaces.DBconnectionInterface;

public class PostgreSqlFactory implements AbstractFactoryInterfaceDB{
    @Override
    public DBconnectionInterface createConnection(){
        return new PostgreSql();
    }
}
