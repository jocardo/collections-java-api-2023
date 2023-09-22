package org.dio.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;
    
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if(!contatoSet.isEmpty()) {
            System.out.println("Contatos: ");
            for (Contato contato : contatoSet) {
                System.out.println(contato);
            }
        } else {
            System.out.println("Não há contatos cadastrados.");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatoSet) {
            if(contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
                //break;
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // agendaContatos.exibirContatos();

        agendaContatos.adicionarContatos("João", 123456789);
        agendaContatos.adicionarContatos("Maria", 987654321);
        agendaContatos.adicionarContatos("José", 456789123);
        agendaContatos.adicionarContatos("José", 321654987); // não adiciona pois já existe um contato com o mesmo nome, de acordo com a regra equals na classe Contato
        agendaContatos.adicionarContatos("José Ricardo", 515161651);

        agendaContatos.exibirContatos();

        System.out.println("Pesquisar contatos por nome: " + agendaContatos.pesquisarPorNome("José"));

        System.out.println("Contatos atualizado: " + agendaContatos.atualizarNumeroContato("José Ricardo", 999999999));
        
        agendaContatos.exibirContatos();
    }

}