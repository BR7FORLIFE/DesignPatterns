package com.desingpattern.DesignPatternStruct.Facade;

public class Main {
    public static void main(String[] args) {
        CineFacade cineFacade = new CineFacade();
        cineFacade.iniciarPelicula();
        cineFacade.apagarPelicula();
    }
    
}
