package org.dio.set.pesquisa;

import java.util.Objects;

public class Contato {
    //atributos
    private String nome;
    private int numero;

    //construtor
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public int getNumero() {
        return numero;
    }

    //setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    //toString
    @Override
    public String toString() {
        return "Contato {" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

}
