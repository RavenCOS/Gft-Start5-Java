package br.com.dio.javafundamental.operadoresrelacionais.exercicio1;

import java.util.Scanner;

import static br.com.dio.javafundamental.operadoresrelacionais.exercicio1.MaiorMenorIgual.maiorMenorIgual;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = teclado.nextDouble();
        maiorMenorIgual(num1, num2);
    }
}
