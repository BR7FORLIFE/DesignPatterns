package com.desingpattern.DesignPatternCreations.Builder;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido.BuildPedido()
            .setAcompanamiento("papas")
            .setBebida("cocacola")
            .setExtraQueso(true)
            .setHamburguesa("doble")
            .setPostre("helado")           
            .build();
        System.out.println(pedido);
    }
}
