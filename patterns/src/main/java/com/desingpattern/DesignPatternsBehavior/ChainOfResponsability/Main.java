package com.desingpattern.DesignPatternsBehavior.ChainOfResponsability;

import java.util.Scanner;

import com.desingpattern.DesignPatternsBehavior.ChainOfResponsability.abstractClass.HandlerSubsidy;
import com.desingpattern.DesignPatternsBehavior.ChainOfResponsability.classes.FoodSubsidy;
import com.desingpattern.DesignPatternsBehavior.ChainOfResponsability.classes.HouseSubsidy;
import com.desingpattern.DesignPatternsBehavior.ChainOfResponsability.classes.NotSubsidy;

public class Main {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            HandlerSubsidy foodHandlerSubsidy = new FoodSubsidy();
            HandlerSubsidy houseSubsidy = new HouseSubsidy();
            HandlerSubsidy notsubsidy = new NotSubsidy();

            System.out.println("Digite su sisben: ");
            String typeSisben = entrada.nextLine();

            foodHandlerSubsidy.filterSubsidy(houseSubsidy);
            houseSubsidy.filterSubsidy(notsubsidy);

            foodHandlerSubsidy.filter(typeSisben, "¿Cual es mi subsidio?");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
