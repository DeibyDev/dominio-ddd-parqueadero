package co.com.sofkau.training.ddd.celda.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.training.ddd.celda.identities.TipoCeldaId;
import co.com.sofkau.training.ddd.celda.values.DescripcionCelda;
import co.com.sofkau.training.ddd.celda.values.Ubicacion;

public class TipoCeldaCreada extends DomainEvent {
    private final TipoCeldaId tipoCeldaId;
    private final DescripcionCelda descripcionCelda;
    private final Ubicacion ubicacion;

    public TipoCeldaCreada(TipoCeldaId tipoCeldaId, DescripcionCelda descripcionCelda, Ubicacion ubicacion) {
        super("celda.TipoCeldaCreada");
        this.tipoCeldaId = tipoCeldaId;
        this.descripcionCelda = descripcionCelda;
        this.ubicacion = ubicacion;
    }

    public TipoCeldaId getTipoCeldaId() {
        return tipoCeldaId;
    }

    public DescripcionCelda getDescripcionCelda() {
        return descripcionCelda;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
