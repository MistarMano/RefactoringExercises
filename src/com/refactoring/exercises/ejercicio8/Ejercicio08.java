package com.refactoring.exercises.ejercicio8;

import com.refactoring.exercises.Reproducible;

//EJERCICIO 8: Extract Interface (Extraer Interfaz)
//Extrae una interfaz "Reproducible" con los métodos públicos

public class Ejercicio08 implements Reproducible {

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
