package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //Atributo Tarefa (outra classe)
    private List<Tarefa> tarefaList;

    //Criando o construtor para que sempre chamarmos um objeto chamado ListaTarefas já ter criado uma list vazia
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }
    //Criando os métodos
    public void adicionarTarefa(String descricaoTarefa){
        tarefaList.add(new Tarefa(descricaoTarefa));
    }
    public void removerTarefa(String descricaoTarefa){
        List<Tarefa> tarefasParaRemover = new ArrayList<>(); //Cria uma nova lista que vai trazer toda a pesquisa
        for (Tarefa t : tarefaList){ //Laço para realizar a pesquisa
            if(t.getDescricaoTarefa().equalsIgnoreCase(descricaoTarefa)){  //Se a descricao da tarefa for igual a descrição do parâmetro descrito
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover); //removeAll para excluir duplicados se tiverem
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoestarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O número total de elementos na lista é: "+listaTarefas.obterNumeroTotalTarefas());  //Shift+10 p executar

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 3"); //Seleciona+ Ctrl+d para duplicar
        System.out.println("O número total de elementos na lista é: "+listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: "+listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoestarefas();   //Selecionar + Ctrl+barra comenta vários

    }

}
