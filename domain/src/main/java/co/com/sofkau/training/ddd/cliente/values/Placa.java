package co.com.sofkau.training.ddd.cliente.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofkau.training.ddd.servicio.values.Fecha;

public class Placa implements ValueObject<String> {
    private final String placa;

    public Placa(String placa) {
        this.placa = placa;
    }

    @Override
    public String value() {
        return placa;
    }
}
