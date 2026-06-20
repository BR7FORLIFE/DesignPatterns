package com.desingpattern.DesignPatternsBehavior.Strategy.strategiesClasses;

import java.math.BigDecimal;

import com.desingpattern.DesignPatternsBehavior.Strategy.PaymentStrategy;

public class StripeStrategy implements PaymentStrategy {
    @Override
    public void pay(BigDecimal price) {
        System.out.println("Pagastes con stripe un valor de: " + price);
    }
}
