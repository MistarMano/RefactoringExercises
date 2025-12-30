package com.refactoring.exercises;

//EJERCICIO 5: Extract Local Variable (Extraer Variable Local)
//Extrae las subexpresiones complejas a variables locales

public class Ejercicio05 {

    public double calcularPrecioFinal(double precioBase, double tasaImpuesto, double descuento) {
        return precioBase * (1 + tasaImpuesto) * (1 - descuento);
    }
}
