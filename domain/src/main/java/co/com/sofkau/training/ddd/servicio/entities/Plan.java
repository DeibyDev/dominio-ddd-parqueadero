package co.com.sofkau.training.ddd.servicio.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.training.ddd.servicio.identities.PlanId;
import co.com.sofkau.training.ddd.servicio.values.Costo;
import co.com.sofkau.training.ddd.servicio.values.TipoPlan;

public class Plan extends Entity<PlanId> {
    private TipoPlan tipoPlan;
    private Costo costo;

    public Plan(PlanId entityId) {
        super(entityId);
    }

    public Plan(PlanId entityId, TipoPlan tipoPlan, Costo costo) {
        super(entityId);
        this.tipoPlan = tipoPlan;
        this.costo = costo;
    }
}
