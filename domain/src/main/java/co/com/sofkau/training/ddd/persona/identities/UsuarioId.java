package co.com.sofkau.training.ddd.persona.identities;

import co.com.sofka.domain.generic.Identity;

public class UsuarioId extends Identity {
    public UsuarioId(String id){
        super(id);
    }

    public static UsuarioId of(String id){
        return new UsuarioId(id);
    }
}
