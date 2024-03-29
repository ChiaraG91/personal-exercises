public class Voto {
    private Double votoCorso;

    public Voto(Double votoCorso) {
        this.votoCorso = votoCorso;
    }

    public Double getVotoCorso() {
        return votoCorso;
    }

    public void setVotoCorso(Double votoCorso) {
        this.votoCorso = votoCorso;
    }

    @Override
    public String toString() {
        return String.valueOf(votoCorso);
    }
}
