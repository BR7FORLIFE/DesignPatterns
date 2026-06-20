package com.desingpattern.DesignPatternsBehavior.templateMethod;

import java.util.List;

//en este patron de diseño la clase abstracta refleja o construye el algoritmo de ejcucion repetitiva
// sus implementaciones solo agregan detalles de cada metodo pero es su clase abstracta quien define el orden
// de ejcucion
public abstract class AbstractImporter<T> {

    public final void importFile(File file) {

        validate(file);

        List<T> entities = parse(file);

        save(entities);

        notifySuccess();
    }

    protected abstract void validate(File file);

    protected abstract List<T> parse(File file);

    protected abstract void save(List<T> entities);

    protected void notifySuccess() {
        System.out.println("Importación exitosa");
    }
}
