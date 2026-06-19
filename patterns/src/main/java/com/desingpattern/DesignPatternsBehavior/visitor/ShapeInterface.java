package com.desingpattern.DesignPatternsBehavior.visitor;

public interface ShapeInterface {
    void accept(ShapeVisitor shapeVisitor);
}
