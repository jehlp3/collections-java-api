package main.set.Pesquisa;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributos
    private Set<Contato> contatoSet;

    //Contructor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //Métodos
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 33334444);
        agendaContatos.adicionarContato("Camila Cavalcante", 33335555);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila DIO", 33337777);
        agendaContatos.adicionarContato("Maria Silva", 33335555);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: "+agendaContatos.atualizarNumeroContato("Maria Silva", 33338888));
    }

}
