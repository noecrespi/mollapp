package edu.poniperro.mollapp.administrador;

import edu.poniperro.mollapp.filtres.Filtre;
import edu.poniperro.mollapp.targets.Target;

import java.util.List;

public class Tasques {

    //Atributos o propiedades (siempre son privados)
    private Target target;
    private List<Filtre> tasques;

    // Contructor
    Tasques(){
    }

    //Metodos

    public List<Filtre> getTasques() {
        return tasques;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void afegirTasca(Filtre tasca) {
        tasques.add(tasca);
    }

    public void execucio(String mensaje){
        target.execucio(mensaje);
        tasques.forEach(tasca -> tasca.execucio(mensaje));
    }
}
