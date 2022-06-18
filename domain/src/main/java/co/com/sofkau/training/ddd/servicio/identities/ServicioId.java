package co.com.sofkau.training.ddd.servicio.identities;

import co.com.sofka.domain.generic.Identity;

public class ServicioId extends Identity {
    public ServicioId(String id){
        super(id);
    }

    public static ServicioId of(String id){
        return new ServicioId(id);
    }
}
