package br.com.dio.javafundamental.estruturasderepeticao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Que numero deseja?");
        int numero = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d * %d = %d\n", numero, i, resultado);
        }
    }
}
