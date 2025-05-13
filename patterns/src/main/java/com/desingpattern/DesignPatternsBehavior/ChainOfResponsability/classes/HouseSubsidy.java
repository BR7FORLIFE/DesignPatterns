package com.desingpattern.DesignPatternsBehavior.ChainOfResponsability.classes;

import com.desingpattern.DesignPatternsBehavior.ChainOfResponsability.abstractClass.HandlerSubsidy;

public class HouseSubsidy extends HandlerSubsidy {
    @Override
    public void filter(String sisben, String message) {
        Boolean isSubsidy = false;

        for (String typeOfSubsisy : extremePoverty) {
            if (typeOfSubsisy.equals(sisben)) {
                isSubsidy = true;
                System.out.println(message + " Su subsidio sera de una casa!!");
            }
        }

        if(!isSubsidy){
            handlerSubsidy.filter(sisben, message);
        }

    }
}
