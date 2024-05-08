package main.list.Pesquisa;

public class Livro {
    //Atributos
    private String nomeLivro;
    private String autorLivro;
    private int anoPublicacaoLivro;

    public Livro(String nomeLivro, String autorLivro, int anoPublicacaoLivro){
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
        this.anoPublicacaoLivro = anoPublicacaoLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public int getAnoPublicacaoLivro() {
        return anoPublicacaoLivro;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeLivro='" + nomeLivro + '\'' +
                ", autorLivro='" + autorLivro + '\'' +
                ", anoPublicacaoLivro=" + anoPublicacaoLivro +
                '}';
    }
}

