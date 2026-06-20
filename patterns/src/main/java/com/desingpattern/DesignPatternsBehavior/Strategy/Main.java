package com.desingpattern.DesignPatternsBehavior.Strategy;

import java.math.BigDecimal;

import com.desingpattern.DesignPatternsBehavior.Strategy.strategiesClasses.PaypalStrategy;
import com.desingpattern.DesignPatternsBehavior.Strategy.strategiesClasses.StripeStrategy;

public class Main {
    public static void main(String[] args) {
        // creamos la estrategia de pagos que queremos utilizar
        PaymentStrategy paypal = new PaypalStrategy();
        PaymentStrategy stripe = new StripeStrategy();

        // una estrategia de pagos con stripe
        PaymentServiceContext paypalContext = new PaymentServiceContext(stripe);
        PaymentServiceContext stripeContext = new PaymentServiceContext(paypal);

        paypalContext.pay(BigDecimal.TEN);
        stripeContext.pay(BigDecimal.ONE);
    }
}
