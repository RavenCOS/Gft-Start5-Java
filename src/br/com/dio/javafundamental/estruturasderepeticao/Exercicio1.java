package br.com.dio.javafundamental.estruturasderepeticao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;
        while (true) {
            System.out.println("digite o nome");
            nome = teclado.next();
            if (nome.equals("0")) break;
            System.out.println("digite a idade");
            idade = teclado.nextInt();
            System.out.println(nome + " tem "+ idade + " anos de idade");
        }

    }
}
