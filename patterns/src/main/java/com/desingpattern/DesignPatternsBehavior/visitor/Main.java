package com.desingpattern.DesignPatternsBehavior.visitor;

import com.desingpattern.DesignPatternsBehavior.visitor.classes.Circle;

public class Main {
    public static void main(String[] args) {
        // creamos la implementacion de la figura que queremos visitar
        ShapeInterface shape = new Circle();

        // creamos el visitor
        shape.accept(new AreaVisitor()); // usamos la implementacion del visitor que es el del area
    }
}
