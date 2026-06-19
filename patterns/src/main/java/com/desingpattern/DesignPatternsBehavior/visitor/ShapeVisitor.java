package com.desingpattern.DesignPatternsBehavior.visitor;

import com.desingpattern.DesignPatternsBehavior.visitor.classes.Circle;
import com.desingpattern.DesignPatternsBehavior.visitor.classes.Rectangule;
import com.desingpattern.DesignPatternsBehavior.visitor.classes.Triangule;

public interface ShapeVisitor {
    void visit(Circle circle);

    void visit(Rectangule rectangule);

    void visit(Triangule triangule);
}
