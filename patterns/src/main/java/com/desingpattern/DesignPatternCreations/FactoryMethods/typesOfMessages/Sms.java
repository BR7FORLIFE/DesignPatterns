package com.desingpattern.DesignPatternCreations.FactoryMethods.typesOfMessages;

import com.desingpattern.DesignPatternCreations.FactoryMethods.interfaces.NotifyInterface;

public class Sms implements NotifyInterface{
    @Override
    public void sendMessage(){
        System.out.println("envia un mensaje de tipo sms!");
    }
}
