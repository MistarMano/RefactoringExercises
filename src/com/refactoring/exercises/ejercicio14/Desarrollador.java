package com.refactoring.exercises.ejercicio14;

public class Desarrollador extends Empleado {

    private String nombre;
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public void calcularSalario() {
        System.out.println("Calculando salario de desarrollador");
    }
}
