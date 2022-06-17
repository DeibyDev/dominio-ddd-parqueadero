package co.com.sofkau.training.ddd.servicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.training.ddd.celda.values.DescripcionCelda;
import co.com.sofkau.training.ddd.celda.values.Ubicacion;
import co.com.sofkau.training.ddd.servicio.values.Costo;
import co.com.sofkau.training.ddd.servicio.values.TipoPlan;

public class ServicioCreado extends DomainEvent {
    private final TipoPlan tipoPlan;
    private final Costo costo;

    public ServicioCreado(TipoPlan tipoPlan, Costo costo){
        super("servicio.ServicioCreado");
        this.tipoPlan = tipoPlan;
        this.costo = costo;
    }

    public TipoPlan getTipoPlan() {
        return tipoPlan;
    }

    public Costo getCosto() {
        return costo;
    }
}
