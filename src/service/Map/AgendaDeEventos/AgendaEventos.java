package service.Map.AgendaDeEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaDeEventos;

    public AgendaEventos() {
        this.agendaDeEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String atracao) {
        Evento evento = new Evento(nomeEvento, atracao);
        agendaDeEventos.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaDeEventos);
        System.out.println(eventosTreeMap);
    }

    public void exibirProximoEvento() {
        LocalDate dataAtual = LocalDate.now();

        LocalDate proximaData;
        Evento proximoEvento;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaDeEventos);
        for(Map.Entry<LocalDate, Evento> element : eventosTreeMap.entrySet()) {
            if(element.getKey().isEqual(dataAtual) || element.getKey().isAfter(dataAtual)) {
                proximaData = element.getKey();
                proximoEvento = element.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data: " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento foda", "Atração foda");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento foda 2", "Atração foda 2");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JANUARY, 10), "Evento foda 3", "Atração foda 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 3), "Evento foda 4", "Atração foda 4");



    }
}
