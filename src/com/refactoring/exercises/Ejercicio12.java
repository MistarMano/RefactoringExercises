package com.refactoring.exercises;

//EJERCICIO 12: Replace Conditional with Polymorphism (Reemplazar Condicional con Polimorfismo)
//Reemplaza el switch con polimorfismo usando herencia

public class Ejercicio12 {

    public double calcularSalario(String tipo, double horasTrabajadas) {
        switch (tipo) {
            case "DESARROLLADOR":
                return horasTrabajadas * 50;
            case "DISEÑADOR":
                return horasTrabajadas * 40;
            case "TESTER":
                return horasTrabajadas * 35;
            default:
                return horasTrabajadas * 30;
        }
    }
}
