package br.com.dio.javafundamental.estruturasderepeticao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        double nota = teclado.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("erro, valor inválido");
            System.out.println("Tente novamente novamente: ");
            nota = teclado.nextDouble();
            if (nota < 0 || nota > 10) System.out.println("Você tá bem?");
        }
            System.out.println("A nota desse aluno é: " + nota);
        }
    }

