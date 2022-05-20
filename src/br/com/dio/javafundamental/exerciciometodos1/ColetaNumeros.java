package br.com.dio.javafundamental.exerciciometodos1;

import java.util.Scanner;

import static br.com.dio.javafundamental.exerciciometodos1.Calculadora.*;
import static br.com.dio.javafundamental.exerciciometodos1.Calculadora.divisao;

public class ColetaNumeros {
    public static void coletaNumeros() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        int num1 = teclado.nextInt();
        System.out.println("digite o segundo numero");
        int num2 = teclado.nextInt();

        soma(num1, num2);
        subtracao(num1, num2);
        multiplicacao(num1, num2);
        divisao(num1, num2);
    }
}
