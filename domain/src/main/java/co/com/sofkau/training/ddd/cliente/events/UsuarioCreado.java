package co.com.sofkau.training.ddd.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.training.ddd.cliente.identities.UsuarioId;
import co.com.sofkau.training.ddd.cliente.values.Activo;
import co.com.sofkau.training.ddd.cliente.values.DocumentoIdentidad;
import co.com.sofkau.training.ddd.cliente.values.Nombre;
import co.com.sofkau.training.ddd.servicio.identities.PlanId;
import co.com.sofkau.training.ddd.servicio.values.Costo;
import co.com.sofkau.training.ddd.servicio.values.TipoPlan;

public class UsuarioCreado extends DomainEvent {
    private final UsuarioId usuarioId;
    private final Nombre nombre;
    private final DocumentoIdentidad documentoIdentidad;
    private final Activo activo;

    public UsuarioCreado(UsuarioId usuarioId, Nombre nombre, DocumentoIdentidad documentoIdentidad, Activo activo) {
        super("cliente.UsuarioCreado");
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.activo = activo;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public DocumentoIdentidad getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public Activo getActivo() {
        return activo;
    }
}
