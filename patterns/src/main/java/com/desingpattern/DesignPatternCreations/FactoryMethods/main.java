package com.desingpattern.DesignPatternCreations.FactoryMethods;

import java.util.Scanner;

import com.desingpattern.DesignPatternCreations.FactoryMethods.interfaces.NotifyInterface;

public class main {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Tipo de mensaje? (email, sms, push): ");
            String typeOfMessage = entrada.nextLine();

            NotifyInterface response = FactoryMethods.createNotification(typeOfMessage.toLowerCase());
            response.sendMessage();
        }
    }
}
