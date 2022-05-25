package br.com.dio.javafundamental.introducaoarrays;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] ordem = {44,14,2,13,102,-13};

        System.out.print("Ordem normal: { ");
        for (int i = 0; i < ordem.length; i++){
            System.out.print(ordem[i] + " ");
        }
        System.out.println("} ");

        System.out.print("Ordem inversa: { ");
        for (int i = ordem.length-1; i >= 0; i--){
            System.out.print(ordem[i] + " ");
        }
        System.out.println(" }");
    }
}
