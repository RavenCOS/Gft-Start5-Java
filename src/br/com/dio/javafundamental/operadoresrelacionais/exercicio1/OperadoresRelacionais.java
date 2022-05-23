package br.com.dio.javafundamental.operadoresrelacionais.exercicio1;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int int1 = 10;
        int int2 = 20;
        int int3 = 3;
        float float1 = 2.6f;
        System.out.println("int1 + int2 == int3 * int1: " + (int1 + int2 == int3 * int1));
        System.out.println("float1 * int3 != float1 * int1 + int2: "+ (float1 * int3 != float1 * int1 + int2));
        float calculoFloat1 = float1 * int3;
        float calculoFloat2 = float1 * int1 + int2;
        boolean resultado1 = calculoFloat1 != calculoFloat2;
        System.out.println(resultado1);
    }
}
