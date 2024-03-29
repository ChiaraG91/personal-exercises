import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Ordine {

    private Integer numOrdine;
    private OffsetDateTime dataCreazione;
    private List<Prodotto> prodottoList;
    private String statoElaborazione;


    public Ordine(Integer numOrdine, OffsetDateTime dataCreazione) {
        this.numOrdine = numOrdine;
        this.dataCreazione = dataCreazione;
        this.prodottoList = new ArrayList<>();
        this.statoElaborazione = "In lavorazione";
    }

    public Integer getNumOrdine() {
        return numOrdine;
    }

    public void setNumOrdine(Integer numOrdine) {
        this.numOrdine = numOrdine;
    }

    public OffsetDateTime getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(OffsetDateTime dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public List<Prodotto> getProdottoList() {
        return prodottoList;
    }

    public void setProdottoList(List<Prodotto> prodottoList) {
        this.prodottoList = prodottoList;
    }

    public String getStatoElaborazione() {
        return statoElaborazione;
    }

    public void setStatoElaborazione(String statoElaborazione) {
        this.statoElaborazione = statoElaborazione;
    }

    @Override
    public String toString() {
        return "Ordine: " + numOrdine + " - " + dataCreazione.format(DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm")) + " - " + statoElaborazione;
    }

    public void stampaInfoOrdine(){
        System.out.println("Ordine: " + numOrdine + " - " + dataCreazione.format(DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm")) + " - " + statoElaborazione);
    }
}
