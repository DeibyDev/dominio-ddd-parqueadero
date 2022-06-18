package co.com.sofkau.training.ddd.servicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.training.ddd.servicio.identities.PlanId;
import co.com.sofkau.training.ddd.servicio.values.Costo;
import co.com.sofkau.training.ddd.servicio.values.TipoPlan;

public class PlanCreado extends DomainEvent {
    private final PlanId planId;
    private final TipoPlan tipoPlan;
    private final Costo costo;

    public PlanCreado(PlanId planId, TipoPlan tipoPlan, Costo costo) {
        super("servicio.PlanCreado");
        this.planId = planId;
        this.tipoPlan = tipoPlan;
        this.costo = costo;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public TipoPlan getTipoPlan() {
        return tipoPlan;
    }

    public Costo getCosto() {
        return costo;
    }
}
