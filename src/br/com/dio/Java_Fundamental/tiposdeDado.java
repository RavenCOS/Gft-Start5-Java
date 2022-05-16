package br.com.dio.Java_Fundamental;

public class tiposdeDado {
    public static void main(String[] args) {
        /*Byte: de -128 até 127*/
            byte a = -128;
            byte b = 127;
        /*short: de -32768 até 32767*/
            short c = -32768;
            short d = 32767;
        /*int: -2147483648 ate 2147483647*/
            int e = -2147483648;
            int f = 2147483647;
        /*long, float e double: muito longo
        long, float e double são representados usando L,F e D respectivamente, colocados ao final do número
        uma váriavel com um número real que não possui atribuição, sempre sera entendida pela linguagem como double*/
            long g = 1983718237890714897L;
            float h = 123.87F;
            double i = 3.14159D;
        /*char: */
            char j = 'a';
            char k = '\u0049';

        /*String: */
            String l = "Abacate";
        /*boolean: retorna true ou false*/
            boolean m = false;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

        }
    }
