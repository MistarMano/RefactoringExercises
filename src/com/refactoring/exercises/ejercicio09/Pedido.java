package com.refactoring.exercises.ejercicio09;

//EJERCICIO 9: Move Method (Mover Método)
//Mueve el método "calcularDescuento" a la clase Cliente

public class Pedido {

    private Cliente cliente;
    private double monto;
    
    public double calcularDescuento() {
        if (cliente.esVIP()) {
            return monto * 0.15;
        }
        return monto * 0.05;
    }
}
