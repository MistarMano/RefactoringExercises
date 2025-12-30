package com.refactoring.exercises;

//EJERCICIO 8: Extract Interface (Extraer Interfaz)
//Extrae una interfaz "Reproducible" con los métodos públicos

public class Ejercicio08 {

    public void reproducir() {
        System.out.println("Reproduciendo");
    }
    
    public void pausar() {
        System.out.println("Pausando");
    }
    
    public void detener() {
        System.out.println("Deteniendo");
    }
    
    private void cargarArchivo() {
        System.out.println("Cargando archivo");
    }
}
