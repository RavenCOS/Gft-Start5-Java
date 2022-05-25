package br.com.dio.javafundamental.estruturasderepeticao;

import java.util.Scanner;

public class Exercicio4 {
    public static int imparPar(int a) {
        int check = a % 2;
        if (check == 0) return 0;
        if (check == 1) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int contPar = 0;
        int contImpar = 0;
        System.out.println("Quantos números deseja?");
        int limite = teclado.nextInt();
        do {
            System.out.print("Digite o numero: ");
            int numero = teclado.nextInt();
            int resultado = imparPar(numero);
            if (resultado == 0) {
                System.out.printf("O numero %d é par\n\n", numero);
                contPar++;
            }
            if (resultado == 1) {
                System.out.printf("O numero %d é impar\n\n", numero);
                contImpar++;
            }
            cont++;
        } while (cont < limite);
        System.out.println("Ao todo foram " + contPar + " numero pares ");
        System.out.print("e " + contImpar + " numero impares");
    }
}
