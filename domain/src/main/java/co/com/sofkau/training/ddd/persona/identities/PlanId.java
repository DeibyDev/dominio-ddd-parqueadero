package co.com.sofkau.training.ddd.persona.identities;

import co.com.sofka.domain.generic.Identity;

public class PlanId extends Identity {
    public PlanId(String id){
        super(id);
    }

    public static PlanId of(String id){
        return new PlanId(id);
    }
}

