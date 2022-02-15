package edu.poniperro.mollapp.clients;

import edu.poniperro.mollapp.administrador.ProgramadorTasques;

public class Mollapp implements Client{

    //Atributos o propiedades (siempre son privados)
    private ProgramadorTasques programador;


    //Constructor
    public Mollapp(){
    }

    //Métodos


    public void setProgramadorTasques(ProgramadorTasques programador){
        this.programador = programador;
    }

    @Override
    public void enviarPeticio(String mensaje){
        System.out.println(String.format("Autenticación OK para %s", mensaje));
    }

    public static void main(String [] args) {
        System.out.println("hola");
    }
}
