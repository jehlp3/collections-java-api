package main.map.Ordenacao;

import java.time.LocalDate;

public class Evento {
    private String nome;
    private String atracao;  //Poderia ser um Map, List ou Collection

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }


    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                ", nome='" + nome + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
