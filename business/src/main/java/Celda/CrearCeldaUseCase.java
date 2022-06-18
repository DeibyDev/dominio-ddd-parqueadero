package Celda;

import Celda.commands.CrearCeldaCommand;
import Celda.identities.CeldaId;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearCeldaUseCase extends UseCase<RequestCommand<CrearCeldaCommand>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CrearCeldaCommand> input) {
        CrearCeldaCommand command = input.getCommand();
        Celda celda = new Celda(new CeldaId() ,command.getDescripcionCelda(),command.getUbicacion());
        emit().onResponse(new ResponseEvents(celda.getUncommittedChanges()));

    }
}
