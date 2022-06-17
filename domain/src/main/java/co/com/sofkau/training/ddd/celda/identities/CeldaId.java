package co.com.sofkau.training.ddd.celda.identities;

import co.com.sofka.domain.generic.Identity;

public class CeldaId extends Identity {
    public CeldaId(String id){
        super(id);
    }

    public static CeldaId of(String id){
        return new CeldaId(id);
    }
}
