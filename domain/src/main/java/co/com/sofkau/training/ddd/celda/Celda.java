package co.com.sofkau.training.ddd.celda;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.training.ddd.celda.entities.TipoCelda;
import co.com.sofkau.training.ddd.celda.events.CeldaCreada;
import co.com.sofkau.training.ddd.celda.identities.CeldaId;
import co.com.sofkau.training.ddd.celda.values.DescripcionCelda;
import co.com.sofkau.training.ddd.celda.values.Ubicacion;
import co.com.sofkau.training.ddd.cliente.Cliente;
import co.com.sofkau.training.ddd.servicio.Servicio;

import java.util.List;

public class Celda extends AggregateEvent<CeldaId> {
    protected Cliente cliente;
    protected Servicio servicio;
    protected TipoCelda tipoCelda;

    public Celda(CeldaId entityId) {
        super(entityId);
    }

    public static Celda from(CeldaId entityId, List<DomainEvent> events) {
        var celda = new Celda(entityId);
        events.forEach(celda::applyEvent);
        return celda;
    }

    public Celda(CeldaId id, DescripcionCelda descripcionCelda, Ubicacion ubicacion) {
        super(id);
        subscribe(new CeldaChange(this));
        appendChange(new CeldaCreada(descripcionCelda, ubicacion)).apply();
    }

    public void asignarCliente(){

    }

    public void asignarServicio(){

    }

    public void asignarCelda(){}
}
