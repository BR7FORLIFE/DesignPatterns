package com.desingpattern.DesignPatternsBehavior.templateMethod;

import java.util.List;

//solo añadimos los detalles de cada comportamiento de cada metodo y es su clase abstracta quien define el flujo
// de ejecucion
public class UserImported extends AbstractImporter<String> {

    public UserImported() {
    }

    @Override
    protected List<String> parse(File file) {
        return List.of();
    }

    @Override
    protected void save(List<String> entities) {
        System.out.println("Archivo guardado exitosamente");
    }

    @Override
    protected void validate(File file) {
        System.out.println("formato correcto!");
    }

}