package com.desingpattern.DesignPatternsBehavior.templateMethod;

public class Main {
    public static void main(String[] args) {
        UserImported imported = new UserImported();
        imported.importFile(new File()); // el flujo de ejecucion ya lo define la clase abstracta
    }
}
