package com.desingpattern.DesignPatternsBehavior.Strategy.strategiesClasses;

import java.math.BigDecimal;

import com.desingpattern.DesignPatternsBehavior.Strategy.PaymentStrategy;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public void pay(BigDecimal price) {
        System.out.println("Pagastes con paypal una cantidad de: " + price);
    }
}
