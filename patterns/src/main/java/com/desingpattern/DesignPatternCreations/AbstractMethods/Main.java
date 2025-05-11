package com.desingpattern.DesignPatternCreations.AbstractMethods;

import java.util.Scanner;

import com.desingpattern.DesignPatternCreations.AbstractMethods.factorys.MySQLfactory;
import com.desingpattern.DesignPatternCreations.AbstractMethods.factorys.PosgreSQLfactory;
import com.desingpattern.DesignPatternCreations.AbstractMethods.globalInterface.GlobalInterface;

public class Main {
    public static void main(String[] args) {
        GlobalInterface globalInterface = null;
        Scanner entrada = new Scanner(System.in);

        System.out.println("En que base de datos quieres la coneccion?: ");
        String db = entrada.nextLine();

        switch (db.toLowerCase()) {
            case "mysql" -> globalInterface = new MySQLfactory();
            case "posgresql" -> globalInterface = new PosgreSQLfactory();
            default -> System.out.println("Digite una base de datos correcta!!");
        }

        Client client = new Client(globalInterface);
        client.connectDatabase();

        entrada.close();

    }
}
