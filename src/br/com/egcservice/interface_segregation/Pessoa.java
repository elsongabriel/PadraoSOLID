package br.com.egcservice.interface_segregation;

/**
 * Created by elson on 11/06/2016.
 */
public class Pessoa implements ITrabalhar, IAndar {

    @Override
    public void andar() {
        System.out.println("Pessoa está andando...");
    }

    @Override
    public void trabalhar() {
        System.out.println("Pessoa está trabalhando...");
    }
}
