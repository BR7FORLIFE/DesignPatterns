package com.desingpattern.DesignPatternCreations.FactoryMethods.typesOfMessages;

import com.desingpattern.DesignPatternCreations.FactoryMethods.NotifyInterface;

public class Email implements NotifyInterface{
    @Override
    public void sendMessage() {
        System.out.println("envia un mensaje de tipo email!");
    }
}
