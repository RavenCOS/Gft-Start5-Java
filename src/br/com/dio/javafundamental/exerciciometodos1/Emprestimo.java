package br.com.dio.javafundamental.exerciciometodos1;

import java.util.Scanner;

public class Emprestimo {
    public static void calculoDuasParcelas(float valor) {
        float valorFinal = (float) (valor + (valor * 0.40));
        System.out.printf("O valor total da compra será: R$%.2f", valorFinal);
    }
    public static void calculoTresParcelas(float valor) {
        float valorFinal = (float) (valor + (valor * 0.60));
        System.out.printf("O valor total da compra será: R$%.2f", valorFinal);
    }

    public static void erro() {
        System.out.println("Erro, parcela invalida");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor do emprestimo?");
        float emprestimo = teclado.nextFloat();
        System.out.println("Em quantas parcelas quer passar?");
        int parcela = teclado.nextInt();

        if (parcela == 2) { calculoDuasParcelas(emprestimo); }
        else if (parcela == 3) {calculoTresParcelas(emprestimo);}
        else { erro();}
    }
}
