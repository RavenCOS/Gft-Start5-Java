package br.com.dio.javafundamental.metodos.exerciciometodos1;

import java.util.Scanner;

public class Mensagem {
    public static void coletaHora() {
        System.out.println("Olá, seja bem vindo");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que horas são?");
        int hora = teclado.nextInt();
        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11 -> mensagemBomDia();
            case 12, 13, 14, 15, 16, 17 -> mensagemBoaTarde();
            case 18, 19, 20, 21, 22, 23 -> mensagemBoaNoite();
            case 24, 1, 2, 3, 4 -> System.out.println("vai dormir!!!");
            default -> System.out.println("erro, hora invalida");
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Espero que tenha um bom dia");
    }
    public static void mensagemBoaTarde() {
        System.out.println("Espero que tenha uma boa tarde");
    }
    public static void mensagemBoaNoite() {
        System.out.println("Espero que tenha um boa noite");
    }
}
