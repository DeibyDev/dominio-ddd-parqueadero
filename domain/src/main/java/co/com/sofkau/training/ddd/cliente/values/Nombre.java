package co.com.sofkau.training.ddd.cliente.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofkau.training.ddd.servicio.values.Fecha;

public class Nombre implements ValueObject<String> {
    private final String nombre;
    private final String apellido;

    public Nombre(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String value() {
        return nombre + " " + apellido;
    }
}
