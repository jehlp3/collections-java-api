package main.list.OperacoesBasicas;

public class Tarefa {
    //Atributo
    private String descricaoTarefa;

    public Tarefa(String descricaoTarefa){
        this.descricaoTarefa = descricaoTarefa;
    }
    //Atalho p Generate - Alt+Ins

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    @Override
    public String toString() {
        return descricaoTarefa;
    }
}
