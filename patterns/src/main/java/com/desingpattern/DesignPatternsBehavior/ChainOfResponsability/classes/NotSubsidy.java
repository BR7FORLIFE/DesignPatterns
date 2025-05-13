package com.desingpattern.DesignPatternsBehavior.ChainOfResponsability.classes;

import com.desingpattern.DesignPatternsBehavior.ChainOfResponsability.abstractClass.HandlerSubsidy;

public class NotSubsidy extends HandlerSubsidy{
    @Override
    public void filter(String sisben, String message){
        boolean isSubsidy = false;

        for(String typeOfSubsisy : moderate){
            if(typeOfSubsisy.equals(sisben)){
                isSubsidy = true;
                System.out.println(message + " Usted no tendrá subsidio!!");
            }
        }

        if(!isSubsidy){
            System.out.println("error con los datos del sisben!!");
        }
    }
}
