import java.time.OffsetDateTime;

public class Riunione implements Evento {

    public OffsetDateTime dataOra;
    public String nomeEvento;
    private TipoEventoEnum tipoEventoEnum;

    public Riunione(OffsetDateTime dataOra, String nomeEvento) {
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
        return tipoEventoEnum.RIUNIONE;
    }

}
