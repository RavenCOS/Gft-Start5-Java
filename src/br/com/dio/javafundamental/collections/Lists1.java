package br.com.dio.javafundamental.collections;

import java.util.*;

public class Lists1 {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println("A nota 5 está na posição " + notas.indexOf(5d));

        notas.add(4,8d);
        System.out.println(notas);
        notas.set(notas.indexOf(5d), 6d);
        System.out.println("Existe um 5 nessa lista? " + notas.contains(5d));
        System.out.println("Qual a terceira nota adicionada na lista? " + notas.get(2));
        System.out.println("O menor numero nessa lista é: " + Collections.min(notas));
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma de todas as notas é: " + soma);
        System.out.println("A média dessas notas é: " + soma/notas.size());
        notas.remove(6);
        System.out.println(notas);
        notas.remove(0);
        System.out.println(notas);
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        notas.clear();
        System.out.println(notas);
        System.out.println(notas.isEmpty());
    }
}
