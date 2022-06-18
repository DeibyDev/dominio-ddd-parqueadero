package co.com.sofkau.training.ddd.servicio;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.training.ddd.celda.Celda;
import co.com.sofkau.training.ddd.celda.entities.TipoCelda;
import co.com.sofkau.training.ddd.celda.events.TipoCeldaCreada;
import co.com.sofkau.training.ddd.servicio.entities.Plan;
import co.com.sofkau.training.ddd.servicio.events.PlanCreado;

public class ServicioChange extends EventChange {
    public ServicioChange(Servicio servicio){
        apply((PlanCreado event) -> {
            servicio.factura = null;
            servicio.plan = new Plan(event.getPlanId(), event.getTipoPlan(), event.getCosto());
        });
    }
}
