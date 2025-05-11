package com.desingpattern.DesignPatternCreations.FactoryMethods;

import com.desingpattern.DesignPatternCreations.FactoryMethods.interfaces.NotifyInterface;
import com.desingpattern.DesignPatternCreations.FactoryMethods.typesOfMessages.Email;
import com.desingpattern.DesignPatternCreations.FactoryMethods.typesOfMessages.Push;
import com.desingpattern.DesignPatternCreations.FactoryMethods.typesOfMessages.Sms;

/**
 * Ejercicio 2: Notificaciones (Intermedio)
 * Desarrolla un Factory Method para manejar diferentes tipos de notificaciones
 * (Email, SMS, Push). Cada notificación debe tener un método enviar(mensaje)
 * que muestre cómo se enviaría el mensaje según el tipo de notificación.
 * 
 * ✏ Objetivo: Crear una clase NotificacionFactory que devuelva la notificación
 * correcta según el tipo pasado como argumento.
 */

public class FactoryMethods {
    public static NotifyInterface createNotification(String typeOfMessage){
        if(typeOfMessage.equalsIgnoreCase("Email")){
            return new Email();
        }else if(typeOfMessage.equalsIgnoreCase("Push")){
            return new Push();
        }else if(typeOfMessage.equalsIgnoreCase("Sms")){
            return new Sms();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
