package br.com.dio.javafundamental.estruturasderepeticao;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Que numero deseja?");
        int numero = teclado.nextInt();
        int fatorial = 1;

        for (int i = numero; i >= 1; i--){
            fatorial *= i;
            System.out.printf(i + "! ");
        }
        System.out.printf("\nO resultado de %d! é: %d", numero, fatorial);
    }
}
