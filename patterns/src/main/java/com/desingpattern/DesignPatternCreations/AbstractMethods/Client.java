package com.desingpattern.DesignPatternCreations.AbstractMethods;

import com.desingpattern.DesignPatternCreations.AbstractMethods.globalInterface.GlobalInterface;
import com.desingpattern.DesignPatternCreations.AbstractMethods.interfaces.ConnectInterface;

public class Client {
    private final ConnectInterface connectInterface;

    public Client(GlobalInterface factorydb) {
        connectInterface = factorydb.connectInterface();
    }

    public void connectDatabase() {
        connectInterface.connect();
    }

}
