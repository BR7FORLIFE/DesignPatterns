package com.desingpattern.DesignPatternsBehavior.visitor;

import com.desingpattern.DesignPatternsBehavior.visitor.classes.Circle;
import com.desingpattern.DesignPatternsBehavior.visitor.classes.Rectangule;
import com.desingpattern.DesignPatternsBehavior.visitor.classes.Triangule;

public class AreaVisitor implements ShapeVisitor {
    @Override
    public void visit(Triangule triangule) {
        System.out.println("Area de circulo");
    }

    @Override
    public void visit(Rectangule rectangule) {
        System.out.println("Area de rectangulo");

    }

    @Override
    public void visit(Circle circle) {
        System.out.println("area de circulo");
    }
}
