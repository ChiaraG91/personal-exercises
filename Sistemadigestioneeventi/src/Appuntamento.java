import java.time.OffsetDateTime;

public class Appuntamento implements Evento{

    public OffsetDateTime dataOra;
    public String nomeEvento;

    public TipoEventoEnum tipoEventoEnum;

    public Appuntamento(OffsetDateTime dataOra, String nomeEvento) {
        this.dataOra = dataOra;
        this.nomeEvento = nomeEvento;
    }

    public void setDataOra(OffsetDateTime dataOra) {
        this.dataOra = dataOra;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    @Override
    public OffsetDateTime getDataOra() {
        return dataOra;
    }

    @Override
    public TipoEventoEnum getTipo() {
        return tipoEventoEnum.APPUNTAMENTO;
    }
}
