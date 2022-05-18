package br.com.dio.javafundamental;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        /*pós-fixado: exp++ ou exp--
        * prefixado: ++exp ou --exp*/
            int a = 10;
            System.out.println("Variavel a sem alteracoes: " + a);
            int b = a--;
            System.out.println("Variavel b: " + b);
            System.out.println("Variavel a depois do a--: " + a);
            int c = 80;
            System.out.println("Variavel c sem alteracoes: " + c);
            int d = ++c;
            System.out.println("Variavel d: " + d);
            System.out.println("Variavel c depois do ++c: " + c);

        /*Aritimetico*/
            int e = 50;
            int f = 10;
            int g = e - f;
            System.out.println(g);
            int h = 10;
            float i = 3.14F;
            float j = h + i / g * f;
            System.out.println(j);
        /*Atribuiçoes*/
            e += f + 5;
            int k = e = --a + 1;
        System.out.println(k);
        System.out.println(e);
        System.out.println(a);

    }
}
