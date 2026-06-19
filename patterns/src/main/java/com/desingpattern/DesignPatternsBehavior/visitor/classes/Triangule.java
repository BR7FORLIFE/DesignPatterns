package com.desingpattern.DesignPatternsBehavior.visitor.classes;

import com.desingpattern.DesignPatternsBehavior.visitor.ShapeInterface;
import com.desingpattern.DesignPatternsBehavior.visitor.ShapeVisitor;

public class Triangule implements ShapeInterface {
    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}
