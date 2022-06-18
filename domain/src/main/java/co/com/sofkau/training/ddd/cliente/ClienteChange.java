package co.com.sofkau.training.ddd.cliente;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.training.ddd.cliente.entities.Usuario;
import co.com.sofkau.training.ddd.cliente.events.UsuarioCreado;
import co.com.sofkau.training.ddd.servicio.Servicio;
import co.com.sofkau.training.ddd.servicio.entities.Plan;
import co.com.sofkau.training.ddd.servicio.events.PlanCreado;

public class ClienteChange extends EventChange {
    public ClienteChange(Cliente cliente){
        apply((UsuarioCreado event) -> {
            cliente.vehiculo = null;
            cliente.usuario = new Usuario(event.getUsuarioId(), event.getNombre(), event.
                    getDocumentoIdentidad(), event.getActivo());
        });
    }
}
