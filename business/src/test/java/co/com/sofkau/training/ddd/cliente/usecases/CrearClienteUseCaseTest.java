package co.com.sofkau.training.ddd.cliente.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.training.ddd.cliente.commands.CrearClienteCommand;
import co.com.sofkau.training.ddd.cliente.events.ClienteCreado;
import co.com.sofkau.training.ddd.cliente.values.Activo;
import co.com.sofkau.training.ddd.cliente.values.DocumentoIdentidad;
import co.com.sofkau.training.ddd.cliente.values.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrearClienteUseCaseTest {
    @Test
    void crearCliente(){
        //arrange
        Nombre nombre = new Nombre("Pablo", "Echeverri");
        DocumentoIdentidad documentoIdentidad = new DocumentoIdentidad("CC", "1037670607");
        Activo activo = new Activo(true);
        CrearClienteCommand command = new CrearClienteCommand(nombre, documentoIdentidad, activo);
        CrearClienteUseCase usecase = new CrearClienteUseCase();

        //act
        List<DomainEvent> events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        ClienteCreado event = (ClienteCreado) events.get(0);
        Assertions.assertEquals("Pablo Echeverri", event.getNombre().value());
        Assertions.assertEquals("CC 1037670607", event.getDocumentoIdentidad().value());
        Assertions.assertEquals(true, event.getActivo().value());
    }
}