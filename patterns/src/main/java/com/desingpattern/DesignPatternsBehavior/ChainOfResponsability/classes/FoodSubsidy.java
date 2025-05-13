package com.desingpattern.DesignPatternsBehavior.ChainOfResponsability.classes;

import com.desingpattern.DesignPatternsBehavior.ChainOfResponsability.abstractClass.HandlerSubsidy;

public class FoodSubsidy extends HandlerSubsidy{
    @Override
    public void filter(String sisben , String message){
        boolean isSubsidy = false;

        for(String typeOfSubsisy: moderatePoverry){
            if(typeOfSubsisy.equals(sisben)){
                isSubsidy = true;
                System.out.println(message + " Su subsidio sera de alimentacion!!");
            }
        }

        if(!isSubsidy){
            handlerSubsidy.filter(sisben, message);
        }
    }
}
