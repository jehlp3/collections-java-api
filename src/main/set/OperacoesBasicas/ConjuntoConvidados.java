package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    //Adicionando convidado
    public void adicionarConvidado(String nomeConvidado, int codigoConvite){
        convidadoSet.add(new Convidado(nomeConvidado, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+" dentro do Set de convidados.");

        conjuntoConvidados.adicionarConvidado("Angélina Matilde", 1111);
        conjuntoConvidados.adicionarConvidado("Berenice Divina", 3333); //Não pode ter elementos repetidos
        conjuntoConvidados.adicionarConvidado("Camila Joana", 3333); //Não pode ter elementos repetidos
        conjuntoConvidados.adicionarConvidado("Doralice Pontes", 4444);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+" dentro do Set de convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(3333);
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+" dentro do Set de convidados.");

        conjuntoConvidados.exibirConvidados();
    }
}
