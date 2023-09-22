package org.dio.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos
    private Set<Produto> produtoSet;

    //construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        this.produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        //Collections.sort(produtosPorNome); - não funciona com Set, pois Collection.sort() só funciona com List
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
    
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Coca-Cola", 5.00d, 10);
        cadastroProdutos.adicionarProduto(2L, "Pepsi", 4.50d, 10);
        cadastroProdutos.adicionarProduto(3L, "Fanta", 4.00d, 10);
        cadastroProdutos.adicionarProduto(4L, "Guaraná", 3.50d, 10);
        cadastroProdutos.adicionarProduto(5L, "Sukita", 3.00d, 10);
        cadastroProdutos.adicionarProduto(6L, "Sprite", 2.50d, 10);
        cadastroProdutos.adicionarProduto(7L, "Kuat", 2.00d, 10);
        cadastroProdutos.adicionarProduto(8L, "Dolly", 1.50d, 10);
        cadastroProdutos.adicionarProduto(9L, "Soda", 0.50d, 10);
        cadastroProdutos.adicionarProduto(9L, "Fruki", 1.80d, 10); // não adiciona, pois já existe um produto com o mesmo código, de acordo com o equals() e hashCode() da classe Produto

        System.out.println("Produtos:");
        for (Produto produto : cadastroProdutos.produtoSet) {
            System.out.println(produto);
        }

        System.out.println("Produtos ordenados por nome:");
        for (Produto produto : cadastroProdutos.exibirProdutosPorNome()) {
            System.out.println(produto);
        }

        System.out.println("\nProdutos ordenados por preço:");
        for (Produto produto : cadastroProdutos.exibirProdutoPorPreco()) {
            System.out.println(produto);
        }
    }
}
