package co.com.sofkau.training.ddd.persona.identities;

import co.com.sofka.domain.generic.Identity;

public class PersonaId extends Identity {
    public PersonaId(String id){
        super(id);
    }

    public static PersonaId of(String id){
        return new PersonaId(id);
    }
}
