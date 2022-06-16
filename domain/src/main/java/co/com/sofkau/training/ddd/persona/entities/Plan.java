package co.com.sofkau.training.ddd.persona.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.training.ddd.persona.identities.PlanId;
import co.com.sofkau.training.ddd.persona.identities.UsuarioId;

public class Plan extends Entity<PlanId> {

    private TipoPlan tipoPlan;
    private Costo costo;

    public Plan(PlanId entityId) {
        super(entityId);
    }
}
