package main.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    //Atributos
    private String nomePessoa;
    private Double alturaPessoa;
    private int idadePessoa;

    public Pessoa(String nomePessoa, Double alturaPessoa, int idadePessoa) {
        this.nomePessoa = nomePessoa;
        this.alturaPessoa = alturaPessoa;
        this.idadePessoa = idadePessoa;
    }
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idadePessoa, p.getIdadePessoa());
    }
    //como estão privados é necessário criar os getters
    public String getNomePessoa() {
        return nomePessoa;
    }

    public Double getAlturaPessoa() {
        return alturaPessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", alturaPessoa=" + alturaPessoa +
                ", idadePessoa=" + idadePessoa +
                '}';
    }


}
class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAlturaPessoa(), p2.getAlturaPessoa());
    }
}