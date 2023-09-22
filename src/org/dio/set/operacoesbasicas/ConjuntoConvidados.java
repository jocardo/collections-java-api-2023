package org.dio.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadoSet;

    //construtor
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        this.convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        //this.convidadoSet.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
        Convidado convidadoParaRemover = null;

        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return this.convidadoSet.size();
    }

    public void exibirListaConvidados() {
        System.out.println("Lista de convidados:");
        for(Convidado c : convidadoSet) {
            System.out.println(c);
        }
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("João", 1);
        conjuntoConvidados.adicionarConvidado("Maria", 2);
        conjuntoConvidados.adicionarConvidado("José", 4);
        conjuntoConvidados.adicionarConvidado("Ana", 4);
        conjuntoConvidados.adicionarConvidado("Pedro", 5);
        conjuntoConvidados.adicionarConvidado("Paula", 6);
        conjuntoConvidados.adicionarConvidado("Carlos", 7);
        conjuntoConvidados.adicionarConvidado("Mariana", 8);
        conjuntoConvidados.adicionarConvidado("Fernando", 9);
        conjuntoConvidados.adicionarConvidado("Juliana", 10);

        conjuntoConvidados.exibirListaConvidados();

        // conjuntoConvidados.removerConvidadoPorCodigoConvite(5);
        // conjuntoConvidados.removerConvidadoPorCodigoConvite(7);
        // conjuntoConvidados.removerConvidadoPorCodigoConvite(9);

        // conjuntoConvidados.exibirListaConvidados();

        // System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
    }

}
