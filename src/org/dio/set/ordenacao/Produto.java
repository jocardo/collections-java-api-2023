package org.dio.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    //atributos
    private long codigo;
    private String nome;
    private double valor;
    private int quantidade;

    //construtor
    public Produto(long codigo, String nome, double valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    //compareTo
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    //getters
    public long getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }
    public int getQuantidade() {
        return quantidade;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return codigo == produto.codigo && Objects.equals(nome, produto.nome);
    }

    //hashCode
    @Override
    public int hashCode() {
        return (int) (codigo * 11 + nome.hashCode() * 7);
    }

    //toString
    @Override
    public String toString() {
        return "Produto {" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}

class ComparatorPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getValor(), p2.getValor());
    }
}