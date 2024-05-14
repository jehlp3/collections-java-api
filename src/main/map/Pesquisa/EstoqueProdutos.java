package main.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    //Métodos
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        if (!estoqueProdutosMap.isEmpty()){
            System.out.println(estoqueProdutosMap);
        }else{
            System.out.println("O estoque está vazio!");
        }
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        } else {
            System.out.println("O estoque está vazio");
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for ( Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }else {
            System.out.println("O estoque está vazio!");
        }
        return produtoMaisCaro;
    }
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() < menorPreco){
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }else{
            System.out.println("O estoque está vazio!");
        }
        return produtoMaisBarato;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 5, 12.0); //60
        estoqueProdutos.adicionarProduto(2L, "Produto B", 2, 60.0); //120
        estoqueProdutos.adicionarProduto(3L, "Produto C", 1, 200.0); //200
        estoqueProdutos.adicionarProduto(4L, "Produto D", 5, 55.0); //275
        estoqueProdutos.adicionarProduto(5L, "Produto E", 7, 19.0); //133 TOTAL 788

        estoqueProdutos.exibirProdutos();

        System.out.println("O valor total do estoque é de $: "+estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("O produto mais caro é o: "+estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("O produto mais barato é o: "+estoqueProdutos.obterProdutoMaisBarato());

        //Criar método para excluir o produto
    }
}
