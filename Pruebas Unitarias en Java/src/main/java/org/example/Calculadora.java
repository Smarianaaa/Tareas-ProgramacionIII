package org.example;

public class Calculadora {
    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        if (b == 0) {
            new ArithmeticException("No se puede dividir por cero.");
        }
        return (double) a / b;
    }
}
