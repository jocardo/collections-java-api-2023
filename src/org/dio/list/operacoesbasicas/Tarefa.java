package org.dio.list.operacoesbasicas;

public class Tarefa {
    //atributo
    private String descricao;

    //construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //getters e setters
    public String getDescricao() {
        return descricao;
    }
    /* 
    public String setDescricao(String descricao) {
        return this.descricao = descricao;
    }
    */

    //método toString
    @Override
    public String toString() {
        /*
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
        */
        return descricao;
    }
}
