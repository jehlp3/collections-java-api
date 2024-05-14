package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributos
    private Map<String, Integer> agendaContatoMap;

    //Constructor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    //PUT - Adiciona e também atualiza o dado.
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone); //adicionando com PUT
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome); //Como é um valor único não precisa percorrer
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Bryan Cranston", 19011976);
        agendaContatos.adicionarContato("Anna Gunn", 12218522);
        agendaContatos.adicionarContato("Aaron Paul", 35563556);
        agendaContatos.adicionarContato("Jonathan Banks", 31011947);
        agendaContatos.adicionarContato("Jonathan Banks", 19473101); //Ele atualizou(replace) o anterior
        agendaContatos.adicionarContato("Giancarlo Esposito", 38931145);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Giancarlo Esposito");
        agendaContatos.exibirContatos();

        System.out.println("O número de telefone é: "+agendaContatos.pesquisarPorNome("Aaron Paul"));

    }
}
