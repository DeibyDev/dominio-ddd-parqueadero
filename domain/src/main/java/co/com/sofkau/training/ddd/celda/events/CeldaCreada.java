package co.com.sofkau.training.ddd.celda.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.training.ddd.celda.entities.TipoCelda;
import co.com.sofkau.training.ddd.celda.values.DescripcionCelda;
import co.com.sofkau.training.ddd.celda.values.Ubicacion;
import co.com.sofkau.training.ddd.servicio.Servicio;

public class CeldaCreada extends DomainEvent {

    private final DescripcionCelda descripcionCelda;
    private final Ubicacion ubicacion;

    public CeldaCreada(DescripcionCelda descripcionCelda, Ubicacion ubicacion){
        super("celda.CeldaCreada");
        this.descripcionCelda = descripcionCelda;
        this.ubicacion = ubicacion;
    }

    public DescripcionCelda getDescripcionCelda() {
        return descripcionCelda;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
