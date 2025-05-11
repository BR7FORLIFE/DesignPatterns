package com.desingpattern.DesignPatternStruct.Facade;

import com.desingpattern.DesignPatternStruct.Facade.classes.Pantalla;
import com.desingpattern.DesignPatternStruct.Facade.classes.Proyector;
import com.desingpattern.DesignPatternStruct.Facade.classes.Sonido;

public class CineFacade {
    private Pantalla pantalla;
    private Proyector proyector;
    private Sonido sonido;

    public CineFacade(){
        this.pantalla = new Pantalla();
        this.proyector = new Proyector();
        this.sonido = new Sonido();
    }

    public void iniciarPelicula(){
        System.out.println("iniciando la pelicula..");
        pantalla.encenderPantalla();
        proyector.encenderProyector();
        sonido.subirSonido();
    }

    public void apagarPelicula(){
        System.out.println("apagando la pelicula!");
        pantalla.apagarPantalla();
        proyector.apagarProyector();
        sonido.bajarSonido();
    }
}
