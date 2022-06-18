package co.com.sofkau.training.ddd.celda;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.training.ddd.celda.entities.TipoCelda;
import co.com.sofkau.training.ddd.celda.events.CeldaCreada;
import co.com.sofkau.training.ddd.celda.events.TipoCeldaCreada;

public class CeldaChange extends EventChange {
    public CeldaChange(Celda celda){
        apply((TipoCeldaCreada event) -> {
            celda.cliente = null;
            celda.servicio = null;
            celda.tipoCelda = new TipoCelda(event.getTipoCeldaId(), event.getDescripcionCelda(), event.getUbicacion());
        });
    }
}
