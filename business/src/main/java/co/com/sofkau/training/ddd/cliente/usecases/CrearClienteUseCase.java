package co.com.sofkau.training.ddd.cliente.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.training.ddd.cliente.Cliente;
import co.com.sofkau.training.ddd.cliente.commands.CrearClienteCommand;
import co.com.sofkau.training.ddd.cliente.entities.Usuario;
import co.com.sofkau.training.ddd.cliente.identities.ClienteId;
import co.com.sofkau.training.ddd.cliente.identities.UsuarioId;

public class CrearClienteUseCase extends UseCase<RequestCommand<CrearClienteCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearClienteCommand> input) {
        CrearClienteCommand command = input.getCommand();
        Cliente cliente = new Cliente(new ClienteId(), command.getNombre(), command.getDocumentoIdentidad(), command.getActivo());
        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));;
    }
}
