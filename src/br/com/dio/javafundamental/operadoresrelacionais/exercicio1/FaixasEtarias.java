package br.com.dio.javafundamental.operadoresrelacionais.exercicio1;

import java.util.Scanner;

public class FaixasEtarias {
    public static String checkIdade(int i) {
        if (i < 10) {
            return "criança";
        } else if (i >= 10 && i < 15) {
            return "pre-adolescênte";
        } else if (i >= 15 && i < 18) {
            return "adolescênte";
        } else if (i >= 18 && i < 40) {
            return "adulta";
        } else if (i >= 40 && i < 60) {
            return "meia idade";
        } else return "idosa";
    }

    public static void faixaEtariaFilme(String faixaEtaria, int filme) {
        if (faixaEtaria != "criança" && faixaEtaria != "pre-adolescênte"  && filme == 2) {
            System.out.println("Essa pessoa poderá assistir ao filme");
        } else if (faixaEtaria == "adulta" || faixaEtaria == "meia idade" || faixaEtaria == "idosa" && filme == 3){
            System.out.println("Essa pessoa poderá assistir ao filme");
        } else {
            System.out.println("Essa pessoa está abaixo da faixa etária permitida");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = teclado.nextInt();
        String faixaEtaria = checkIdade(idade);
        System.out.println("Essa pessoa esta na faixa de: " + faixaEtaria);
        System.out.println("Qual filme deseja escolher? ");
        System.out.print("[1] Rio \n[2] Star Wars \n[3] Scarface \n");
        int filme = teclado.nextInt();
        switch (filme) {
            case 1 -> System.out.println("O filme é livre para todos os públicos");
            case 2, 3 -> faixaEtariaFilme(faixaEtaria, filme);
        }
    }
}
