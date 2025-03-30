package com.desingpattern.DesignPatternStruct.Adapter;

import com.desingpattern.DesignPatternStruct.Adapter.Interfaces.PagoConTarjeta;

public class PagoConTarjetaCredito implements PagoConTarjeta{
    @Override
    public void procesarPago(Double mount){
        System.out.println("Pagando con tarjeta de credito - Monto: " + mount);
    }
}
