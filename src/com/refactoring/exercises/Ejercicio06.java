package com.refactoring.exercises;

//EJERCICIO 6: Convert Local Variable to Field (Convertir Variable Local a Campo)
//Convierte la variable "tasaInteres" en un campo de la clase

public class Ejercicio06 {

    public double calcularInteres(double capital, int meses) {
        double tasaInteres = 0.05;
        return capital * tasaInteres * meses;
    }
}
