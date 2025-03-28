package com.desingpattern.DesignPatternCreations.FactoryMethods.typesOfMessages;

import com.desingpattern.DesignPatternCreations.FactoryMethods.interfaces.NotifyInterface;

public class Push implements NotifyInterface{
    @Override
    public void sendMessage(){
        System.out.println("Envia un mensaje de tipo push!");
    }
}
