package br.com.dio.javafundamental.introducaoarrays;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        for (int i = 0; i < consoantes.length; i++) {
            System.out.println("Digite a " + (i+1) + "ª letra: ");
            String letra = teclado.next();
            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))
            ){
                quantConsoantes++;
                consoantes[i] = letra;
            }
        }

        System.out.println("Ao todo foram " + quantConsoantes + " consoantes, que são: ");
        for (String consoante : consoantes) {
            if(consoante != null)
                System.out.print(consoante + " ");
        }
    }
}
