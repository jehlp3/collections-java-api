package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String nomeLivro, String autorLivro, int anoPublicacaoLivro){
        livroList.add(new Livro(nomeLivro, autorLivro, anoPublicacaoLivro));
    }
    public List<Livro> pesquisarPorAutor(String autorPesquisado){
        //Preparando a lista
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){  //1º Verifique se ela não está vazia
            for (Livro l: livroList){
                if (l.getAutorLivro().equalsIgnoreCase(autorPesquisado)){
                    livrosPorAutor.add(l);
                }
            }
            System.out.println("A lista está vazia!");
    }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
         List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
         if (!livroList.isEmpty()) {
             for (Livro l : livroList) {
                 if (l.getAnoPublicacaoLivro() >= anoInicial && l.getAnoPublicacaoLivro() <= anoFinal) {
                     livrosPorIntervaloAnos.add(l);
                 }
             }
         }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String nomeLivro){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getNomeLivro().equalsIgnoreCase(nomeLivro)){
                    livroPorTitulo = l;
                    break; //pq preciso apenas do 1º livro
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Memórias Póstumas de Brás Cubas", "Machado de Assis",1881);
        catalogoLivros.adicionarLivro("O Cortiço", "Aluísio Azevedo",1890);
        catalogoLivros.adicionarLivro("Macunaíma", "Mário de Andrade",1928);
        catalogoLivros.adicionarLivro("Dom Casmurro", "Machado de Assis",1899);
        catalogoLivros.adicionarLivro("Vidas Secas", "Graciliano Ramos",1938);
        catalogoLivros.adicionarLivro("Holocausto Brasileiro", "Daniela Arbex",2013);
        catalogoLivros.adicionarLivro("Macunaíma", "Mário de Andrade",1928);

        System.out.println(catalogoLivros.pesquisarPorAutor("Machado de Assis"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1900,2013));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Macunaíma"));
    }
}
