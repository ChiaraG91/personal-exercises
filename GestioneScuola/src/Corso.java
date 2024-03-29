import java.util.List;

public class Corso {

    private String nomeCorso;
    private Integer codiceCorso;
    private String insegnante;

    public Corso(String nomeCorso, Integer codiceCorso, String insegnante) {
        this.nomeCorso = nomeCorso;
        this.codiceCorso = codiceCorso;
        this.insegnante = insegnante;
    }

    public String getNomeCorso() {
        return nomeCorso;
    }

    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public Integer getCodiceCorso() {
        return codiceCorso;
    }

    public void setCodiceCorso(Integer codiceCorso) {
        this.codiceCorso = codiceCorso;
    }

    public String getInsegnante() {
        return insegnante;
    }

    public void setInsegnante(String insegnante) {
        this.insegnante = insegnante;
    }


    @Override
    public String toString() {
        return nomeCorso + '\'' + codiceCorso + '\'' +  insegnante;
    }

    public void stampaInfoCorso(){
        System.out.println();
        System.out.println("Corso: " + codiceCorso + " - " + nomeCorso + " - " + insegnante);
    }
}
