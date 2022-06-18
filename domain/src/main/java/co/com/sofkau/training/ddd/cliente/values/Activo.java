package co.com.sofkau.training.ddd.cliente.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofkau.training.ddd.servicio.values.Fecha;

public class Activo implements ValueObject<Boolean> {
    private final Boolean activo;

    public Activo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public Boolean value() {
        return activo;
    }
}
