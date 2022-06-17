package co.com.sofkau.training.ddd.servicio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.training.ddd.servicio.values.Costo;
import co.com.sofkau.training.ddd.servicio.values.TipoPlan;

public class CrearServicioCommand extends Command {
    private final TipoPlan tipoPlan;
    private final Costo costo;

    public CrearServicioCommand(TipoPlan tipoPlan, Costo costo) {
        this.tipoPlan = tipoPlan;
        this.costo = costo;
    }

    public TipoPlan getTipoPlan() {
        return tipoPlan;
    }

    public Costo getCosto() {
        return costo;
    }
}
