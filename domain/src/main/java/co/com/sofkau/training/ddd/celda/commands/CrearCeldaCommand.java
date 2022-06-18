package co.com.sofkau.training.ddd.celda.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.training.ddd.celda.entities.TipoCelda;
import co.com.sofkau.training.ddd.celda.values.DescripcionCelda;
import co.com.sofkau.training.ddd.celda.values.Ubicacion;

public class CrearCeldaCommand extends Command {
    private final DescripcionCelda descripcionCelda;
    private final Ubicacion ubicacion;

    public CrearCeldaCommand(DescripcionCelda descripcionCelda, Ubicacion ubicacion){
        this.descripcionCelda = descripcionCelda;
        this.ubicacion = ubicacion;
    }

    public DescripcionCelda getDescripcionCelda() {
        return descripcionCelda;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
