package co.com.sofkau.training.ddd.cliente.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.training.ddd.cliente.identities.UsuarioId;
import co.com.sofkau.training.ddd.cliente.values.Activo;
import co.com.sofkau.training.ddd.cliente.values.DocumentoIdentidad;
import co.com.sofkau.training.ddd.cliente.values.Nombre;

public class Usuario extends Entity<UsuarioId> {
    private Nombre nombre;
    private DocumentoIdentidad documentoIdentidad;
    private Activo activo;

    public Usuario(UsuarioId entityId, Nombre nombre, DocumentoIdentidad documentoIdentidad, Activo activo) {
        super(entityId);
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.activo = activo;
    }

    public Nombre consultarNombre() {
        return nombre;
    }

    public DocumentoIdentidad consultarDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public Activo consultarActivo() {
        return activo;
    }

    public void actualizarNombre() {
    }

    public void actualizarDocumentoIdentidad() {
    }

    public void modificarEstado() {
    }
}
