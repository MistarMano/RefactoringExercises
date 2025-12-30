package com.refactoring.exercises;

//EJERCICIO 4: Inline Method (Método en línea)
//Aplica inline al método "esMayor" ya que solo se usa una vez

public class Ejercicio04 {

    private boolean esMayor(int a, int b) {
        return a > b;
    }
    
    public int obtenerMaximo(int a, int b) {
        if (esMayor(a, b)) {
            return a;
        }
        return b;
    }
}
