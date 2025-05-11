package com.desingpattern.DesignPatternStruct.Adapter;

import com.desingpattern.DesignPatternStruct.Adapter.Interfaces.PagoConTarjeta;

/**
 * Ejercicio: Sistema de pago con distintos métodos
 * Tienes un sistema que solo acepta pagos con tarjeta de crédito, pero ahora
 * necesitas agregar la opción de pagos con PayPal sin modificar la lógica
 * existente. Implementa el patrón Adapter para que el sistema pueda procesar
 * pagos con ambos métodos.
 * 
 * Requisitos
 * Crea una interfaz PagoConTarjeta con un método procesarPago(double monto).
 * 
 * Implementa la clase PagoTarjetaCredito, que usa la interfaz PagoConTarjeta.
 * 
 * Crea una nueva clase PagoPayPal con un método enviarPago(double cantidad),
 * pero sin implementar PagoConTarjeta directamente.
 * 
 * Implementa un adaptador AdaptadorPayPal que haga que PagoPayPal funcione con
 * PagoConTarjeta.
 * 
 * En la clase Main, prueba ambos métodos de pago.
 */
public class MainAdapter {
    public static void main(String[] args) {
        PagoConTarjeta pagoTarjeta = new PagoConTarjetaCredito();
        pagoTarjeta.procesarPago(500.0);

        System.out.println();

        PagoPaypal pagoPayPal = new PagoPaypal();
        PagoConTarjeta adaptadorPayPal = new AdaptadorPaypal(pagoPayPal);
        adaptadorPayPal.procesarPago(500.0);
    }
}