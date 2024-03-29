public class Film {

    private String titolo;
    private String regista;
    private Integer annoUscita;
    private double valutazione;

    public Film(String titolo, String regista, Integer annoUscita, double valutazione) {
        this.titolo = titolo;
        this.regista = regista;
        this.annoUscita = annoUscita;
        this.valutazione = valutazione;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public Integer getAnnoUscita() {
        return annoUscita;
    }

    public void setAnnoUscita(Integer annoUscita) {
        this.annoUscita = annoUscita;
    }

    public double getValutazione() {
        return valutazione;
    }

    public void setValutazione(double valutazione) {
        this.valutazione = valutazione;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titolo='" + titolo + '\'' +
                ", regista='" + regista + '\'' +
                ", annoUscita=" + annoUscita +
                ", valutazione=" + valutazione +
                '}';
    }

    public void stampaDettagli(){
        System.out.println("Film: " + titolo + " - " + regista + " - " + annoUscita  + " - " + valutazione);
    }
}
