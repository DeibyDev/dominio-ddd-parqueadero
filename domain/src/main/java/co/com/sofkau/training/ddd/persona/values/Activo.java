package co.com.sofkau.training.ddd.persona.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Activo implements ValueObject<Boolean> {

    private final Boolean value;

    public Activo(Boolean value) {
        this.value = Objects.requireNonNull(value, "ESTADO REQUERIDO");
    }

    @Override
    public Boolean value() {
        return false;
    }
}
