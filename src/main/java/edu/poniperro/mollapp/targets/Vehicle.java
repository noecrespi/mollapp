package edu.poniperro.mollapp.targets;

public class Vehicle implements Target {

    // constructor de la clase vehículo
    public Vehicle(){
    }

    @Override
    public void execucio(String mensaje) {
        System.out.println(String.format("Puerta abierta %s !", mensaje));
    }
}
