package org.dio.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaContatos;

    //construtor
    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone){
        this.agendaContatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!this.agendaContatos.isEmpty()){
            this.agendaContatos.remove(nome);
        }
    }

    public void exibirContatos(){
        if(!this.agendaContatos.isEmpty()){
            for (Map.Entry<String, Integer> contato : agendaContatos.entrySet()) {
                System.out.println("Nome: " + contato.getKey() + " - Telefone: " + contato.getValue());
            }
        }
    }

    public Integer pesquisarPorNome(String nome){
        if(!this.agendaContatos.isEmpty()){
            return this.agendaContatos.get(nome);
        }
        return null;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("José", 456789123);
        agendaContatos.adicionarContato("Ana", 321654987);
        agendaContatos.adicionarContato("Pedro", 654123987);
        agendaContatos.adicionarContato("Paula", 789456123);
        agendaContatos.adicionarContato("Carlos", 987123654);
        agendaContatos.adicionarContato("Mariana", 321789654);
        agendaContatos.adicionarContato("Fernanda", 456123789);
        agendaContatos.adicionarContato("Rafael", 654789123);
        agendaContatos.adicionarContato("Rafael", 955845121);

        //System.out.println("Contatos:");
        //agendaContatos.exibirContatos();

        // System.out.println("\nContato de Maria: " + agendaContatos.pesquisarPorNome("Maria"));
         System.out.println("Contato de Rafael: " + agendaContatos.pesquisarPorNome("Rafael"));
        // System.out.println("Contato de João: " + agendaContatos.pesquisarPorNome("João"));
        // System.out.println("Contato de Ana: " + agendaContatos.pesquisarPorNome("Ana"));
        // System.out.println("Contato de José: " + agendaContatos.pesquisarPorNome("José"));
        // System.out.println("Contato de Paula: " + agendaContatos.pesquisarPorNome("Paula"));
        // System.out.println("Contato de Carlos: " + agendaContatos.pesquisarPorNome("Carlos"));
        // System.out.println("Contato de Mariana: " + agendaContatos.pesquisarPorNome("Mariana"));
        // System.out.println("Contato de Fernanda: " + agendaContatos.pesquisarPorNome("Fernanda"));
        // System.out.println("Contato de Pedro: " + agendaContatos.pesquisarPorNome("Pedro"));

        agendaContatos.removerContato("Maria");
        agendaContatos.removerContato("Rafael");
        agendaContatos.removerContato("João");
        agendaContatos.removerContato("Ana");
        
        System.out.println("Contato de Rafael: " + agendaContatos.pesquisarPorNome("Rafael"));
    }
} 
