package br.com.dio.javafundamental.operadoresrelacionais.exercicio2;

import java.util.Scanner;

public class NomeDoMes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero do mês: ");
        short numMes = teclado.nextShort();
        switch (numMes) {
            case 1:
                System.out.println("O mês é Janeiro");
                break;
            case 2:
                System.out.println("O mês é Fevereiro");
                break;
            case 3:
                System.out.println("O mês é Março");
                break;
            case 4:
                System.out.println("O mês é Abril");
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            default:
                System.out.println("Erro, mês inexistente");
                break;
        }
    }
}
