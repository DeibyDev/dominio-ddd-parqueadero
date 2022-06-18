package co.com.sofkau.training.ddd.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.training.ddd.cliente.values.Activo;
import co.com.sofkau.training.ddd.cliente.values.DocumentoIdentidad;
import co.com.sofkau.training.ddd.cliente.values.Nombre;
import co.com.sofkau.training.ddd.servicio.values.Costo;
import co.com.sofkau.training.ddd.servicio.values.TipoPlan;

public class ClienteCreado extends DomainEvent {
    private final Nombre nombre;
    private final DocumentoIdentidad documentoIdentidad;
    private final Activo activo;

    public ClienteCreado(Nombre nombre, DocumentoIdentidad documentoIdentidad, Activo activo){
        super("cliente.ClienteCreado");
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.activo = activo;
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
