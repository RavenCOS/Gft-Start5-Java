package br.com.dio.javafundamental.metodos.exerciciometodos2;

public class Sobrecarga {
    public static void area(double raio) {
        System.out.println("Calculo da area de uma circuferência: ");
        final double pi = 3.14d;
        double area = pi * Math.pow(raio,2);
        System.out.printf("A area dessa circuferência será: %.2f cm\n", area);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Calculo de um Retangulo: ");
        double area = lado1 * lado2;
        System.out.printf("A area desse retangulo será de: %.2f cm\n",area);
    }

    public static void area(float base, double altura) {
        System.out.println("Calculo da area de um triângulo: ");
        double area = (base * altura)/2;
        System.out.printf("A area desse triângulo será de: %.2f cm\n",area);
    }
    public static void area(double base, float altura) {
        System.out.println("Calculo da area de um paralelogramo");
        double area = base * altura;
        System.out.printf("A area desse paralelogramo será de: %.2f cm\n",area);
    }
}

