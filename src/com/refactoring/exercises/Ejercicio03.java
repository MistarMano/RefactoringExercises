package com.refactoring.exercises;

//EJERCICIO 3: Extract Constant (Extraer Constante)
//Extrae los números mágicos a constantes con nombres descriptivos

public class Ejercicio03 {

    public double calcularImpuesto(double monto) {
        return monto * 0.21;
    }
    
    public boolean esMontoValido(double monto) {
        return monto >= 0 && monto <= 10000;
    }
}
