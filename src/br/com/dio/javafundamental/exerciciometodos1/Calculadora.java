package br.com.dio.javafundamental.exerciciometodos1;

public class Calculadora {
    public static void soma(int a , int b) {
        int resultado = a + b;
        System.out.print("Seu resultado é: ");
        System.out.println(resultado);
    }
    public static void subtracao(int a , int b) {
        int resultado = a - b;
        System.out.print("Seu resultado é: ");
        System.out.println(resultado);
    }
    public static void multiplicacao(int a , int b) {
        int resultado = a * b;
        System.out.print("Seu resultado é: ");
        System.out.println(resultado);
    }
    public static void divisao(double a , double b) {
        double resultado = a / b;
        System.out.print("Seu resultado é: ");
        System.out.println(resultado);
    }
}
