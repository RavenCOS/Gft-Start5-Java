package br.com.dio.javafundamental.introducaoarrays;

import java.util.Random;

public class Exercicio4 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] matriz = new int[6][6];
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                matriz[linha][coluna] = aleatorio.nextInt(10);
            }
        }
        for (int[] linha: matriz) {
            for (int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
