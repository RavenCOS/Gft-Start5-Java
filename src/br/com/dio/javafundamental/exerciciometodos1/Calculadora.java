package br.com.dio.javafundamental.exerciciometodos1;

public class Calculadora {
    public static void soma(int a , int b) {
        int resultado = a + b;
        System.out.printf("O resultado de %d + %d é: ", a, b);
        System.out.println(resultado);
    }
    public static void subtracao(int a , int b) {
        int resultado = a - b;
        System.out.printf("O resultado de %d - %d é: ", a, b);
        System.out.println(resultado);
    }
    public static void multiplicacao(int a , int b) {
        int resultado = a * b;
        System.out.printf("O resultado de %d * %d é: ", a, b);
        System.out.println(resultado);
    }
    public static void divisao(int a , int b) {
        double resultado = (double) a / (double) b;
        System.out.printf("O resultado de %d / %d é: %.2f", a, b, resultado);
    }
}
