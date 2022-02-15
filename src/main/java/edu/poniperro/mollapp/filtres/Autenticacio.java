package edu.poniperro.mollapp.filtres;

public class Autenticacio implements Filtre {

    public Autenticacio(){
    }

    @Override
    public void execucio(String mensaje) {
        System.out.println(String.format("Autentifiación OK para %s", mensaje));
    }
}
