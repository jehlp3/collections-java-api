package main.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //Atributos
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    //Implementação da ordenação - TreeMap
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);  //Já exibe os valores ordenados pela data
    }

    public void obterProximoEvento() {
        /*Set<LocalDate> dateSet = eventosMap.keySet();     Retorna um Set com todas as keys
        Collection<Evento> values = eventosMap.values();    Retorna todos os valores
            Não atendem pois os métodos não se conhecem, não há relação entre esses valores. Ou ele traz todas as keys
            ou ele traz todos os values
            São coleções independentes
         */
        // eventosMap.get();  Não atende pois eu não sei ainda qual evento eu quero

        LocalDate dataAtual = LocalDate.now(); //Pegando a data atual quando o sistema rodar
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {  //entrySet() retorna um Set (elementos únicos dif do Map)
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + entry.getValue() + "acontecerá na data: " + entry.getKey());
                break;
            }

        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.APRIL, 24), "Lollapalloza 2025", "Lady Gaga");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.NOVEMBER, 06), "Iron Maiden SP", "Iron Maiden");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.NOVEMBER, 14), "M72 World Tour", "Metallica");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 20), "Rock in Rio", "Imagine Dragons");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.APRIL, 23), "Lollapalloza 2024", "Hozier");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
