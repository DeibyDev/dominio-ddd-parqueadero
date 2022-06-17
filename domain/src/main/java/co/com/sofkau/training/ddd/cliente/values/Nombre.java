package co.com.sofkau.training.ddd.cliente.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofkau.training.ddd.servicio.values.Fecha;

public class Nombre implements ValueObject<Nombre> {
    private final String nombre;
    private final String apellido;

    public Nombre(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public Nombre value() {
        return new Nombre(nombre, apellido);
    }
}
