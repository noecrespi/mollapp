package edu.poniperro.mollapp.administrador;

import edu.poniperro.mollapp.filtres.Filtre;
import edu.poniperro.mollapp.targets.Target;

public class ProgramadorTasques {

    //Atributos
    private Target target;
    private Tasques tasques;

    //Constructor que el constructor que tiene que guardar target
    public ProgramadorTasques(Target target){

        this.target = target;
    }

    public void setTasques(Tasques tasques) {
        this.tasques = tasques;
    }

    //Metodos
    public Target getTarget() {
        return target;
    }

    public void setTasca(Filtre tarea){
        tasques.afegirTasca(tarea);
    }

    public void executarTasques(String mensaje){
        tasques.execucio(mensaje);
    }
}
