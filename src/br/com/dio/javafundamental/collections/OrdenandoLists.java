package br.com.dio.javafundamental.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenandoLists {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Isadora", 36,"Amarela"));
            add(new Gato("Silver", 15,"Cinza"));
            add(new Gato("Tami", 5,"Branca"));
            add(new Gato("Kira", 8,"Preta"));
        }};
        System.out.println("Ordem de entrada: \n" + meusGatos);
        Collections.shuffle(meusGatos);
        System.out.println("Ordem aleatória: \n" + meusGatos);
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("Ordem de idade: ");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println("Ordem de cor: ");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
        System.out.println("Ordem de nome, cor ou idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);


    }

}
class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
class ComparatorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}
class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
    int nomes = gato1.getNome().compareToIgnoreCase(gato2.getNome());
    if (nomes != 0) return nomes;
    int cores = gato1.getCor().compareTo(gato2.getCor());
    if (cores != 0) return cores;
    return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}