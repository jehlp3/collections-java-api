package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //Atributos
    private String palavra;

    //Constructor
    public ConjuntoPalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }
    //Getter
    public String getPalavra() {
        return palavra;
    }
    //Não permite a adição de elementos iguais
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(palavra, that.palavra);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavra);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavra='" + palavra + '\'' +
                '}';
    }
    //___________________________________________
    private Set<ConjuntoPalavrasUnicas> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicasSet = new HashSet<>();
    }
    //Métodos
    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(new ConjuntoPalavrasUnicas(palavra));
    }
    public void removerPalavra(String palavra){
        ConjuntoPalavrasUnicas palavraParaRemover = null;
        for (ConjuntoPalavrasUnicas c : palavrasUnicasSet){
            if (c.getPalavra() == palavra){
                palavraParaRemover = c;
                break;
            }
        }
        palavrasUnicasSet.remove(palavraParaRemover);
    }
    public void verificarPalavra(String palavra){
        ConjuntoPalavrasUnicas palavraConsulta = null;
        for (ConjuntoPalavrasUnicas c : palavrasUnicasSet){
            if (c.getPalavra() == palavra){
                palavraConsulta = c;
                break;
            }
        }
        System.out.println(palavraConsulta);
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }


    //_________________________________________
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Banana");
        conjuntoPalavrasUnicas.adicionarPalavra("Abacaxi");
        conjuntoPalavrasUnicas.adicionarPalavra("Abacaxi");
        conjuntoPalavrasUnicas.adicionarPalavra("Ameixa");
        conjuntoPalavrasUnicas.adicionarPalavra("Kiwi");
        conjuntoPalavrasUnicas.adicionarPalavra("Laranja");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Ameixa");

        conjuntoPalavrasUnicas.removerPalavra("Kiwi");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
