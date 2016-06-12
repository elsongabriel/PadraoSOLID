package br.com.egcservice.open_closed;

/**
 * Created by elson on 11/06/2016.
 */
public class ContaPoupanca extends Conta {

    @Override
    public void sacar() {
        System.out.println("Está sacando da Conta Poupança..");
    }
}
