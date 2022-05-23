package br.com.dio.javafundamental.operadoresrelacionais.exercicio2;

import java.util.Scanner;

public class NomeDoMes {
    public static void nomeDoMes(int numMes) {

        switch (numMes) {
            case 1 -> {
                System.out.println("O mês é Janeiro");
                System.out.println("Sabe o que isso significa?");
                System.out.println("FERIAS, ISSO MESMO, FERIAS");
            }
            case 2 -> System.out.println("O mês é Fevereiro");
            case 3 -> System.out.println("O mês é Março");
            case 4 -> System.out.println("O mês é Abril");
            case 5 -> System.out.println("O mês é Maio");
            case 6 -> System.out.println("O mês é Junho");
            case 7 -> {
                System.out.println("O mês é Julho");
                System.out.println("Sabe o que isso significa?");
                System.out.println("FERIAS, ISSO MESMO, FERIAS");
            }
            case 8 -> System.out.println("O mês é Agosto");
            case 9 -> System.out.println("O mês é Setembro");
            case 10 -> System.out.println("O mês é Outubro");
            case 11 -> System.out.println("O mês é Novembro");
            case 12 -> {
                System.out.println("O mês é Dezembro");
                System.out.println("Feliz ano novo e boas férias");
            }
            default -> System.out.println("Erro, mês inexistente");
        }
    }
}
