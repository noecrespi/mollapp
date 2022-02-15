package edu.poniperro.mollapp.clients;

import edu.poniperro.mollapp.administrador.ProgramadorTasques;

public interface Client {

    void setProgramadorTasques(ProgramadorTasques tasques);

    void enviarPeticio(String mensaje);
}