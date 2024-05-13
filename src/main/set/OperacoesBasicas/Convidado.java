package main.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    //Atributos
    private String nomeConvidado;
    private int codigoConvite;

    public Convidado(String nomeConvidado, int codigoConvite) {
        this.nomeConvidado = nomeConvidado;
        this.codigoConvite = codigoConvite;
    }

    public String getNomeConvidado() {
        return nomeConvidado;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nomeConvidado='" + nomeConvidado + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
