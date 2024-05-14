package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //Atributos
    private Map<String, String> dicionarioPalavrasMap;

    public Dicionario() {
        this.dicionarioPalavrasMap = new HashMap<>();
    }

    //Métodos
    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioPalavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioPalavrasMap.isEmpty()) {
            dicionarioPalavrasMap.remove(palavra);
        } //Adicionar else para caso o dicionário estiver vazio!
    }

    public void exibirPalavras() {
        System.out.println(dicionarioPalavrasMap);
    } //Adicionar else para caso o dicionário estiver vazio!

    public void pesquisarPorPalavra(String palavra) {
        String definicaoPalavra = dicionarioPalavrasMap.get(palavra);
        if (definicaoPalavra != null) {
            System.out.println("Definição de '" + palavra + "': " + definicaoPalavra);
        } else {
            System.out.println("Não existe a palavra cadastrada no dicionário");
        }
    }


    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Positivismo","Condição ou característica de positivo; de essência segura; que não se desfaz com facilidade; definitivo");
        dicionario.adicionarPalavra("Resiliência", "Capacidade natural para se recuperar de uma situação adversa, problemática; superação");
        dicionario.adicionarPalavra("Integridade","É a qualidade de uma pessoa que é íntegra e honesta, demonstrando valor e retidão de caráter");
        dicionario.adicionarPalavra("Empatia","É a aptidão para se identificar com os outros, se colocando no lugar da outra pessoa, compreendendo seus sentimentos e modo de ser");
        dicionario.adicionarPalavra("Desistência","Ação ou efeito de desistir, ato de renunciar voluntariamente ou não dar continuidade a algo");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Desistência");
        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("Renúncia");
    }
}
