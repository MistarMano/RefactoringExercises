package com.refactoring.exercises.ejercicio07;

//EJERCICIO 7: Extract Superclass (Extraer Superclase)
//Extrae los atributos y métodos comunes a una superclase "Vehiculo"

public class Auto extends VEHICULO {

    private String marca;
    private String modelo;
    private int año;
    
    public void arrancar() {
        System.out.println("Arrancando auto");
    }
    
    public void detener() {
        System.out.println("Deteniendo auto");
    }	
}
