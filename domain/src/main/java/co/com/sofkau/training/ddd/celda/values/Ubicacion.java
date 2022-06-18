package co.com.sofkau.training.ddd.celda.values;

import co.com.sofka.domain.generic.ValueObject;

public class Ubicacion implements ValueObject<Ubicacion> {
    private final String sector;
    private final String numeroCelda;

    public Ubicacion(String sector, String numeroCelda) {
        this.sector = sector;
        this.numeroCelda = numeroCelda;
    }

    @Override
    public Ubicacion value() {
        return new Ubicacion(sector, numeroCelda);
    }
}
