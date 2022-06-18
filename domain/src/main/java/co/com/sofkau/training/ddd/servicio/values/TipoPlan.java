package co.com.sofkau.training.ddd.servicio.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofkau.training.ddd.celda.values.Ubicacion;

public class TipoPlan implements ValueObject<String> {
    private final String tipoPlan;

    public TipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    @Override
    public String value() {
        return tipoPlan;
    }
}
