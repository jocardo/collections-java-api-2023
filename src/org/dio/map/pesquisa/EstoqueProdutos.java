package org.dio.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos
    private Map<Long, Produto> estoqueProdutos;

    //construtor
    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        this.estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        if(!this.estoqueProdutos.isEmpty()){
            //System.out.println("Produtos:" + this.estoqueProdutos);
            for (Map.Entry<Long, Produto> produto : estoqueProdutos.entrySet()) {
                System.out.println("Código: " + produto.getKey() + " - Produto: " + produto.getValue());
            }
        }
    }

    public void calculcarValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!this.estoqueProdutos.isEmpty()){
            for(Produto p : this.estoqueProdutos.values()){
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        System.out.println("Valor total do estoque: " + valorTotalEstoque);
    }

    public void obterProdutoMaisCaro(){
        double maiorPreco = 0d;
        Produto produtoMaisCaro = null;
        if(!this.estoqueProdutos.isEmpty()){
            for(Produto p : this.estoqueProdutos.values()){
                if(p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    }

    //public void obterProdutoMaisBarato(){ }

    //public void obeterProdutoMaiorQuantidadeValorTotalNoEstoque(){ }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1L, "Produto 1", 10, 10.0d);
        estoqueProdutos.adicionarProduto(2L, "Produto 2", 20, 20.0d);
        estoqueProdutos.adicionarProduto(3L, "Produto 3", 30, 30.0d);
        estoqueProdutos.adicionarProduto(4L, "Produto 4", 40, 40.0d);

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.calculcarValorTotalEstoque();

        estoqueProdutos.obterProdutoMaisCaro();


    }

}
