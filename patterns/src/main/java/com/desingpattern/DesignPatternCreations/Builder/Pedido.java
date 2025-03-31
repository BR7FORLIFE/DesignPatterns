/**
 * 📝 Ejercicio 1: Builder para un Pedido de Comida 🍔
 * Crea una clase Pedido con los siguientes atributos:
 * 
 * hamburguesa: String (tipo de hamburguesa)
 * 
 * bebida: String (tipo de bebida)
 * 
 * acompanamiento: String (papas, ensalada, etc.)
 * 
 * postre: String (opcional)
 * 
 * extraQueso: boolean
 * 
 * 📌 Tareas:
 * 
 * Implementa el patrón Builder en la clase Pedido.
 * 
 * Asegúrate de que cada método set retorne this para permitir method chaining.
 * 
 * Agrega un método build() que devuelva un Pedido con la configuración
 * establecida.
 * 
 * Crea un pedido usando PedidoBuilder y muéstralo con toString().
 */
package com.desingpattern.DesignPatternCreations.Builder;

public class Pedido {
    private final String hamburguesa;
    private final String bebida;
    private final String acompanamiento;
    private final String postre; 
    private final boolean extraQueso;

    private Pedido(BuildPedido builder) {
        this.hamburguesa = builder.hamburguesa;
        this.bebida = builder.bebida;
        this.acompanamiento = builder.acompanamiento;
        this.postre = builder.postre;
        this.extraQueso = builder.extraQueso;
    }

    @Override
    public String toString() {
        return "Pedido {" +
                "Hamburguesa='" + hamburguesa + '\'' +
                ", Bebida='" + bebida + '\'' +
                ", Acompañamiento='" + acompanamiento + '\'' +
                ", Postre='" + (postre != null ? postre : "No asignado") + '\'' +
                ", Extra Queso=" + (extraQueso ? "Sí" : "No") +
                '}';
    }

    public static class BuildPedido {
        private String hamburguesa;
        private String bebida;
        private String acompanamiento;
        private String postre = null; 
        private boolean extraQueso = false; 

        public BuildPedido setHamburguesa(String hamburguesa) {
            this.hamburguesa = hamburguesa;
            return this;
        }

        public BuildPedido setBebida(String bebida) {
            this.bebida = bebida;
            return this;
        }

        public BuildPedido setAcompanamiento(String acompanamiento) {
            this.acompanamiento = acompanamiento;
            return this;
        }

        public BuildPedido setPostre(String postre) { 
            this.postre = postre;
            return this;
        }

        public BuildPedido setExtraQueso(boolean extraQueso) {
            this.extraQueso = extraQueso;
            return this;
        }

        public Pedido build() {
            return new Pedido(this);
        }
    }
}
