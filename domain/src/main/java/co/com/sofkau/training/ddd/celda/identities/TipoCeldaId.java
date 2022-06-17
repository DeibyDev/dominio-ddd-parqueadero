package co.com.sofkau.training.ddd.celda.identities;

import co.com.sofka.domain.generic.Identity;

public class TipoCeldaId extends Identity {
    public TipoCeldaId(String id){
        super(id);
    }

    public static TipoCeldaId of(String id){
        return new TipoCeldaId(id);
    }
}
