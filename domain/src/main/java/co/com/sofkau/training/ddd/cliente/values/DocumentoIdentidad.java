package co.com.sofkau.training.ddd.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class DocumentoIdentidad implements ValueObject<DocumentoIdentidad> {
    private final String tipo;
    private final String digitos;

    public DocumentoIdentidad(String tipo, String digitos) {
        this.tipo = tipo;
        this.digitos = digitos;
    }

    @Override
    public DocumentoIdentidad value() {
        return new DocumentoIdentidad(tipo, digitos);
    }
}
