package br.com.dio.javafundamental.estruturasderepeticao;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acumulador = 0;
        int maiorNumero = 0;
        int contador = 0;
        int numero;

        do {
            System.out.printf("Digite o %dº numero\n", contador+1);
            numero = teclado.nextInt();
            if(maiorNumero < numero) maiorNumero = numero;
            acumulador += numero;
            contador++;
        } while(contador < 5);
        double media = (double) acumulador/5;
        System.out.println("A media desses numeros foi de: " + media);
        System.out.println("O maior numero digitado foi: " + maiorNumero);

    }
}
