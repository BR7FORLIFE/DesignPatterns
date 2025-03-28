package com.desingpattern.DesignPatternCreations.AbstractMethods.Factorys;

import com.desingpattern.DesignPatternCreations.AbstractMethods.TypesOfDatabases.PostgreSql;
import com.desingpattern.DesignPatternCreations.AbstractMethods.interfaces.DBconecction;
import com.desingpattern.DesignPatternCreations.AbstractMethods.interfaces.DBconnectionInterface;

public class PostgreSqlFactory implements DBconecction{
    @Override
    public DBconnectionInterface createConnection(){
        return new PostgreSql();
    }
}
