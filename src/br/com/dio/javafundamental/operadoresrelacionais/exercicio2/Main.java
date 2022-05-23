package br.com.dio.javafundamental.operadoresrelacionais.exercicio2;

import java.util.Scanner;

import static br.com.dio.javafundamental.operadoresrelacionais.exercicio2.NomeDoMes.nomeDoMes;
import static br.com.dio.javafundamental.operadoresrelacionais.exercicio2.NumeroDia.numDia;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dia");
        String nomeDia = teclado.next();
        int dia = numDia(nomeDia);
        if (dia >= 1) {
            System.out.printf("%s é o %d dia da semana\n", nomeDia, dia);
        } else {
            System.out.println("Erro, dia invalido");
        }
        System.out.println("Digite o numero do mês: ");
        short numMes = teclado.nextShort();
        nomeDoMes(numMes);
    }
}
