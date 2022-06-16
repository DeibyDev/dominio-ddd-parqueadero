package co.com.sofkau.training.ddd.persona.identities;

import co.com.sofka.domain.generic.Identity;

public class AdministradorId extends Identity {
    public AdministradorId(String id){
        super(id);
    }

    public static AdministradorId of(String id){
        return new AdministradorId(id);
    }
}
