package co.com.sofkau.training.ddd.servicio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.training.ddd.servicio.entities.Factura;
import co.com.sofkau.training.ddd.servicio.entities.Plan;
import co.com.sofkau.training.ddd.servicio.events.ServicioCreado;
import co.com.sofkau.training.ddd.servicio.identities.ServicioId;
import co.com.sofkau.training.ddd.servicio.values.Costo;
import co.com.sofkau.training.ddd.servicio.values.TipoPlan;

import java.util.List;

public class Servicio extends AggregateEvent<ServicioId> {
    protected Plan plan;
    protected Factura factura;

    public Servicio(ServicioId entityId) {
        super(entityId);
    }

    public static Servicio from(ServicioId id, List<DomainEvent> events) {
        var servicio = new Servicio(id);
        events.forEach(servicio::applyEvent);
        return servicio;
    }

    public Servicio(ServicioId id, TipoPlan tipoPlan, Costo costo) {
        super(id);
        subscribe(new ServicioChange(this));
        appendChange(new ServicioCreado(tipoPlan, costo)).apply();
    }

    public Plan consultarPlan() {
        return plan;
    }

    public Factura consultarFactura() {
        return factura;
    }

    public void generarFactura(){}

    public void asignarPlan(){}

    public void modificarPlan(){}
}
