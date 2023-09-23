package org.dio.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //atributos
    private Map<LocalDate, Evento> eventosMap;
    
    //construtor
    public AgendaEventos() { this.eventosMap = new HashMap<>(); }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        this.eventosMap.put(data, new Evento(nome, atracao));
    }

    //public void exibirAgendaEventos() { this.eventosMap.forEach((data, evento) -> System.out.println(data + " - " + evento)); }
    public void exibirAgenda() { 
        Map<LocalDate, Evento> eventosMapOrdenado = new TreeMap<>(eventosMap);
        eventosMapOrdenado.forEach((data, evento) -> System.out.println(data + " - " + evento));
        //System.out.println(eventosMapOrdenado);
     }

     public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
          LocalDate dataEvento = entry.getKey();
          if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
            proximaData = dataEvento;
            proximoEvento = entry.getValue();
            break;
          }
        }
        if (proximoEvento != null) {
          System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
        } else {
          System.out.println("Não há eventos futuros na agenda.");
        } 
      }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.FEBRUARY, 10), "Show do Metallica", "Metallica");
        agendaEventos.adicionarEvento(LocalDate.of(2020, 8, 11), "Show do Iron Maiden", "Iron Maiden");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 12), "Show do Sepultura", "Sepultura");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 13), "Show do Sepultura", "Sepultura");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }

}