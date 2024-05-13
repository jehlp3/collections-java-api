package main.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String nome;
    private long cod;
    private double preco;
    private int quantidade;

    public Produto(String nome, Long cod, Double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return cod == produto.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod);
    }

    public String getNome() {
        return nome;
    }

    public Long getCod() {
        return cod;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "{ "+nome + "," + cod +","+ preco+","+ quantidade +"}";
    }


}
class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) { //primeira letra
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}