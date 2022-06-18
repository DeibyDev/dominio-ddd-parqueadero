package co.com.sofkau.training.ddd.servicio.values;

import co.com.sofka.domain.generic.ValueObject;

public class Fecha implements ValueObject<Fecha> {
    private final String fechaIngreso;
    private final String fechaSalida;


    public Fecha(String fechaIngreso, String fechaSalida) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }


    @Override
    public Fecha value() {
        return new Fecha(fechaIngreso, fechaSalida);
    }
}
