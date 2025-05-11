package com.desingpattern.DesignPatternStruct.Adapter;

public class PagoPaypal {
    public void enviarPago(double cantidad) {
        System.out.println("Procesando pago con PayPal: $" + cantidad);
    }
}
