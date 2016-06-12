package br.com.egcservice.interface_segregation;

/**
 * Created by elson on 11/06/2016.
 */
public class Animal implements IAndar {

    @Override
    public void andar() {
        System.out.println("Animal está andando...");
    }

    //animal não pode trabalhar
}
