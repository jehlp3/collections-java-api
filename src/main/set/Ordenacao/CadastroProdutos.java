package main.set.Ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //Atributos
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    //A comparação pode ser feita pelo Comparable
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); //Não pode ser com HashSet pq ele não retorna organizado, utilizaremos o TreeSet
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1001L, "Caneca", 30.0d, 3);
        cadastroProdutos.adicionarProduto(1002L, "Luminária", 99.0d, 1);
        cadastroProdutos.adicionarProduto(1003L, "Óculos", 120.0d, 2);
        cadastroProdutos.adicionarProduto(1004L, "Monitor", 450.0d, 1);
        cadastroProdutos.adicionarProduto(1002L, "Mouse", 35.0d, 1);
        cadastroProdutos.adicionarProduto(1005L, "Agenda 2025", 35.0d, 1);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }

}
