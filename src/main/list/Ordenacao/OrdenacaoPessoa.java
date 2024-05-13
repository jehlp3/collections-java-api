package main.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
//Atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nomePessoa, int idadePessoa, double alturaPessoa){
        pessoaList.add(new Pessoa(nomePessoa, alturaPessoa, idadePessoa));
    }
    //Comparable - Interface q altera a classe que iremos manipular
    public List<Pessoa> ordenarPorIdade(){
     List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;

    }
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Ana Maria de Almeida", 33, 1.65);
        ordenacaoPessoa.adicionarPessoa("Bernardo do Campo Verde", 22, 1.75);
        ordenacaoPessoa.adicionarPessoa("Caetano Veloso da Silva", 50, 1.72);
        ordenacaoPessoa.adicionarPessoa("Dante José", 44, 1.82);

        System.out.println(ordenacaoPessoa.pessoaList);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}

