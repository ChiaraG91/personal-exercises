import java.time.OffsetDateTime;

public interface Evento {

    OffsetDateTime getDataOra();

    TipoEventoEnum getTipo();
}
