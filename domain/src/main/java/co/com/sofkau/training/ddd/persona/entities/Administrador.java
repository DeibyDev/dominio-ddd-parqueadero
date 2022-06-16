package co.com.sofkau.training.ddd.persona.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.training.ddd.persona.identities.AdministradorId;
import co.com.sofkau.training.ddd.persona.identities.UsuarioId;
import co.com.sofkau.training.ddd.persona.values.Activo;
import co.com.sofkau.training.ddd.persona.values.DocumentoIdentidad;
import co.com.sofkau.training.ddd.persona.values.Nombre;

public class Administrador extends Entity<AdministradorId> {

    private Nombre nombre;
    private DocumentoIdentidad documentoIdentidad;
    private Activo activo;
    private Historial historial;


    public Administrador(AdministradorId entityId) {
        super(entityId);
    }
}
