package co.com.sofkau.training.ddd.celda.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.training.ddd.celda.identities.TipoCeldaId;
import co.com.sofkau.training.ddd.celda.values.DescripcionCelda;
import co.com.sofkau.training.ddd.celda.values.Ubicacion;

public class TipoCelda extends Entity<TipoCeldaId> {
    private DescripcionCelda descripcionCelda;
    private Ubicacion ubicacion;

    public TipoCelda(TipoCeldaId entityId) {
        super(entityId);
    }

    public TipoCelda(TipoCeldaId entityId, DescripcionCelda descripcionCelda, Ubicacion ubicacion) {
        super(entityId);
        this.descripcionCelda = descripcionCelda;
        this.ubicacion = ubicacion;
    }

    public DescripcionCelda consultarDescripcion(){
        return descripcionCelda;
    }

    public Ubicacion consultarUbicacion(){
        return ubicacion;
    }

    public void actualizarDescripcion(){}

    public void actualizarUbicacion(){}
}
