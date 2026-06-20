package com.desingpattern.DesignPatternsBehavior.Strategy;

import java.math.BigDecimal;

//definimos la inferfaz donde sus metodos es la accion en comun de sus implementaciones
public interface PaymentStrategy {
    void pay(BigDecimal price);
}
