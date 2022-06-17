package co.com.sofkau.training.ddd.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.training.ddd.cliente.entities.Usuario;
import co.com.sofkau.training.ddd.cliente.entities.Vehiculo;
import co.com.sofkau.training.ddd.cliente.events.ClienteCreado;
import co.com.sofkau.training.ddd.cliente.identities.ClienteId;
import co.com.sofkau.training.ddd.cliente.values.Activo;
import co.com.sofkau.training.ddd.cliente.values.DocumentoIdentidad;
import co.com.sofkau.training.ddd.cliente.values.Nombre;
import co.com.sofkau.training.ddd.servicio.Servicio;
import co.com.sofkau.training.ddd.servicio.ServicioChange;
import co.com.sofkau.training.ddd.servicio.events.ServicioCreado;
import co.com.sofkau.training.ddd.servicio.identities.ServicioId;
import co.com.sofkau.training.ddd.servicio.values.Costo;
import co.com.sofkau.training.ddd.servicio.values.TipoPlan;

import java.util.List;

public class Cliente extends AggregateEvent<ClienteId> {
    protected Usuario usuario;
    protected Vehiculo vehiculo;

    public Cliente(ClienteId entityId) {
        super(entityId);
    }

    public static Cliente from(ClienteId id, List<DomainEvent> events) {
        var cliente = new Cliente(id);
        events.forEach(cliente::applyEvent);
        return cliente;
    }

    public Cliente(ClienteId id, Nombre nombre, DocumentoIdentidad documentoIdentidad, Activo activo) {
        super(id);
        subscribe(new ClienteChange(this));
        appendChange(new ClienteCreado(nombre, documentoIdentidad, activo)).apply();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
