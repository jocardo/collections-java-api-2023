package org.dio.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributos
    private List<Pessoa> pessoaList;

    //construtor
    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);

        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
        //pessoaList.sort((p1, p2) -> p1.getIdade() - p2.getIdade());
        //return pessoaList;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);

        //Collections entende que eu quero ordenar pessoas por altura, por meio do Coparator, quando eu não passo o Comparator, ele entende que eu quero ordenar pessoa implementa pelo Comparable
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
        //pessoasPorAltura.sort(new ComparatorPorAltura());
        //return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        ordenacaoPessoa.pessoaList.forEach(System.out::println);

        // ordenacaoPessoa.ordenarPorIdade().forEach(System.out::println);
        // ordenacaoPessoa.ordenarPorAltura().forEach(System.out::println);
        //System.out.println("Ordenando por idade: " + ordenacaoPessoa.ordenarPorIdade());
        // System.out.println("Ordenando por altura: " + ordenacaoPessoa.ordenarPorAltura());    
    }

}
