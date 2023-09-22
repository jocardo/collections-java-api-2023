package org.dio.list.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    //atributos
    private String nome;
    private int idade;
    private double altura;

    //construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //compareTo - Se o comparable não possuir generics Pessoa, o compareTo deve ser assim:
    /* 
    @Override
    public int compareTo(Object o) {
        Pessoa outraPessoa = (Pessoa) o;
        return this.nome.compareTo(outraPessoa.getNome());
    }
    */

    @Override
    public int compareTo(Pessoa p) {
        //Como idade é int, podemos usar Wrapper Integer que possui o método compare
        return Integer.compare(idade, p.getIdade());
    }

    //getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }

    //toString
    @Override
    public String toString() {
        return "Pessoa {" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}


class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}