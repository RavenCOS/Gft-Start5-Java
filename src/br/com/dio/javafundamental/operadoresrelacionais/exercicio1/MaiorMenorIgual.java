package br.com.dio.javafundamental.operadoresrelacionais.exercicio1;

public class MaiorMenorIgual {
    public static void maiorMenorIgual(double a, double b) {
        if (a > b) {
            System.out.printf("o numero %.2f é maior que o numero %.2f\n\n", a, b);
        } else if (a < b) {
            System.out.printf("o numero %.2f é menor que o numero %.2f\n\n", a, b);
        } else {
            System.out.printf("o numero %.2f é igual que o numero %.2f\n\n", a, b);
        }
    }
}
