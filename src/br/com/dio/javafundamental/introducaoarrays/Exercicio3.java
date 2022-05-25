package br.com.dio.javafundamental.introducaoarrays;

import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {
        Random aleatorio = new Random(20);
        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = aleatorio.nextInt(100);
        }
        for (int numero: numeros) {
            System.out.print(numero + " ");
        }
    }
}
