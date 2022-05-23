package br.com.dio.javafundamental.metodos.exerciciometodos3;

public class SobrecargaReturn {
    public static double area(double raio) {
        final double pi = 3.14d;
        return pi * Math.pow(raio,2);
    }

    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double area(float base, double altura) {
        return (base * altura)/2;
    }
    public static double area(double base, float altura) {
        return base * altura;
    }
}

