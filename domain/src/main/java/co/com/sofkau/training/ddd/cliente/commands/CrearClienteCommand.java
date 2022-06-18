package co.com.sofkau.training.ddd.cliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.training.ddd.cliente.values.Activo;
import co.com.sofkau.training.ddd.cliente.values.DocumentoIdentidad;
import co.com.sofkau.training.ddd.cliente.values.Nombre;

public class CrearClienteCommand extends Command {
    private final Nombre nombre;
    private final DocumentoIdentidad documentoIdentidad;
    private final Activo activo;

    public CrearClienteCommand(Nombre nombre, DocumentoIdentidad documentoIdentidad, Activo activo) {
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
