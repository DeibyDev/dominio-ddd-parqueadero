package Celda;

import Celda.commands.CrearCeldaCommand;
import Celda.events.CeldaCreada;
import Celda.values.DescripcionCelda;
import Celda.values.Ubicacion;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CrearCeldaUseCaseTest {
    @Test
    void crearCliente() {
        //arrange
        DescripcionCelda descripcionCelda = new DescripcionCelda("Destapado" , "Campero");

        Ubicacion ubicacion = new Ubicacion("f15", "2537");

        CrearCeldaCommand command = new CrearCeldaCommand(descripcionCelda, ubicacion);
        CrearCeldaUseCase crearCelda= new CrearCeldaUseCase();



        //act
        List<DomainEvent> events = UseCaseHandler.getInstance()

                .syncExecutor(crearCelda, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert
        CeldaCreada event = (CeldaCreada) events.get(0);
        Assertions.assertEquals("Destapado Campero", event.getDescripcionCelda().value());
        Assertions.assertEquals("f15 2537", event.getUbicacion().value());


    }
}
