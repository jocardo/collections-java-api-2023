package org.dio.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itemList;

    //construtor
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item i : itemList) {
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else
            System.out.println("A lista está vazia!");
    }

    public double calcularValorTotal() { 
        double valorTotal = 0d;
        if(!itemList.isEmpty()){
            for(Item i : itemList) {
                valorTotal += i.getPreco() * i.getQuantidade();
            }
            return valorTotal;
        } else
            throw new RuntimeException("A lista está vazia!");
    }

    public void exibirItens() {
        
        if(!itemList.isEmpty()){
            System.out.println(itemList);
        } else
            System.out.println("A lista está vazia!");
    }

    public static void main(String[] args){        
        CarrinhoDeCompras listaItem = new CarrinhoDeCompras();

        // listaItem.adicionarItem("Arroz", 6.90, 3);
        // listaItem.adicionarItem("Feijão", 8.40, 2);
        // listaItem.adicionarItem("Macarrão", 11.30, 2);
        // listaItem.adicionarItem("Macarrão", 11.30, 2);
        listaItem.exibirItens();

        listaItem.removerItem("Feijão");
        listaItem.exibirItens();

        System.out.println("Valor total: " + listaItem.calcularValorTotal());
    }
}
