package co.com.sofkau.training.ddd.servicio.values;

import co.com.sofka.domain.generic.ValueObject;

public class Costo implements ValueObject<Integer> {
    private final Integer valor;

    public Costo(Integer valor) {
        this.valor = valor;
    }

    @Override
    public Integer value() {
        return valor;
    }
}
