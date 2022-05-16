package br.com.dio.Java_Fundamental;

public class declarandoVariaveis {
    public static void main(String[] args) {
        //Exemplo de Boas Práticas:
        int i;
        int I; //Sendo uma linguagem case sensitive, podemos usar duas variáveis de mesmo nome, diferenciando com letra maiuscula e minuscula.
        int numero; //Usamos letras minusculas nas variáveis.
        int idade1Pedro; //Variáveis podem ser misturadas com letras e números.
        int quantidadeProduto; //Uso do camelCase para variáveis de várias palavras.
        final int QUANTIDADE_GATOS = 10; //Para constantes é ideal usar letras maiusculas e separar sentenças com _.

        i = 10;
        I = 20;
        numero = 2022;
        idade1Pedro = 29;
        quantidadeProduto = 200;

        /*
        Exemplo de Más Práticas:
            - Não dão erro de compilação, mas não são ideais:
                int _i;
                int _sala1;
                int $ANDAR2;
                int NumeroQuarto;
                int qtdgt;
                final int quantidadeGatos;
            - Erro de compilação:
                int 1cor;
                int Numero Quarto;
                int _i%;
                int continue;
            * Variáveis não podem conter números no inicio, ser divididas com espaço, conter caracteres especiais ou funções usadas pela ide(ex for, goto).
        */

        System.out.println(i);
        System.out.println(I);
        System.out.println(numero);
        System.out.println(idade1Pedro);
        System.out.println(quantidadeProduto);
        System.out.println(QUANTIDADE_GATOS);}
}
