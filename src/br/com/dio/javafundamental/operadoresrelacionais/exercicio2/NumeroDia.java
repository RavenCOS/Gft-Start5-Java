package br.com.dio.javafundamental.operadoresrelacionais.exercicio2;

public class NumeroDia {
    public static int numDia(String nomeDia) {
        return switch (nomeDia) {
            case "domingo" -> 1;
            case "segunda" -> 2;
            case "terça" -> 3;
            case "quarta" -> 4;
            case "quinta" -> 5;
            case "sexta" -> 6;
            case "sabado" -> 7;
            default -> 0;
        };
    }
}
