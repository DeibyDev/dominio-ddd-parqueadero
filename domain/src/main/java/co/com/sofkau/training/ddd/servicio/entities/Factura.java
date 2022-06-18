package co.com.sofkau.training.ddd.servicio.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.training.ddd.servicio.identities.FacturaId;
import co.com.sofkau.training.ddd.servicio.values.Costo;
import co.com.sofkau.training.ddd.servicio.values.Fecha;

public class Factura extends Entity<FacturaId> {
    private Costo valorTotal;
    private Fecha fecha;

    public Factura(FacturaId entityId) {
        super(entityId);
    }

    public Factura(FacturaId entityId, Costo valorTotal, Fecha fecha) {
        super(entityId);
        this.valorTotal = valorTotal;
        this.fecha = fecha;
    }

    public void modificarCosto(){}
}
