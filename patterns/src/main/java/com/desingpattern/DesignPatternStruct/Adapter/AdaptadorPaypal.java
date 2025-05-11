package com.desingpattern.DesignPatternStruct.Adapter;

import com.desingpattern.DesignPatternStruct.Adapter.Interfaces.PagoConTarjeta;

public class AdaptadorPaypal implements PagoConTarjeta{
    private PagoPaypal pagoPaypal;

    public AdaptadorPaypal(PagoPaypal pagoPaypal){
        this.pagoPaypal = pagoPaypal;
    }
    @Override
    public void procesarPago(Double mount){
        pagoPaypal.enviarPago(30.00);
    }
}
