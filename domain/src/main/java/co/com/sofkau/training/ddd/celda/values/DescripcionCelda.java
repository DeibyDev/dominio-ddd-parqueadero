package co.com.sofkau.training.ddd.celda.values;

import co.com.sofka.domain.generic.ValueObject;

public class DescripcionCelda implements ValueObject<DescripcionCelda> {
    private final String cubierta;
    private final String tipoVehiculoCelda;

    public DescripcionCelda(String cubierta, String tipoVehiculoCelda) {
        this.cubierta = cubierta;
        this.tipoVehiculoCelda = tipoVehiculoCelda;
    }

    @Override
    public DescripcionCelda value() {
        return new DescripcionCelda(cubierta, tipoVehiculoCelda);
    }
}
