package br.com.egcservice.single_resposability;

/**
 * Created by elson on 11/06/2016.
 */
public class Cliente {
    private String nome;
    private int numeroConta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}
