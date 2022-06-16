package co.com.sofkau.training.ddd.persona.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.training.ddd.persona.identities.PlanId;
import co.com.sofkau.training.ddd.persona.identities.UsuarioId;
import co.com.sofkau.training.ddd.persona.values.Activo;
import co.com.sofkau.training.ddd.persona.values.DocumentoIdentidad;
import co.com.sofkau.training.ddd.persona.values.Nombre;

public class Usuario extends Entity<UsuarioId> {

    private Nombre nombre;
    private DocumentoIdentidad documentoIdentidad;
    private Activo activo;
    private VehiculoId vehiculoId;
    private PlanId planId;

    public Usuario(UsuarioId entityId) {
        super(entityId);
    }
}
