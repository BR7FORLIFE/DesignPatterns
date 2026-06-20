package com.desingpattern.DesignPatternsBehavior.Strategy;

import java.math.BigDecimal;

public class PaymentServiceContext {

    private final PaymentStrategy strategy;

    public PaymentServiceContext(PaymentStrategy paymentStrategy) {
        this.strategy = paymentStrategy;
    }

    public void pay(BigDecimal price) {
        strategy.pay(price); // llamamos a la estrategia para hacer el pago
    }
}
