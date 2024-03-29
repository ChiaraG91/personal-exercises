import java.time.OffsetDateTime;
import java.util.Objects;

public class Appuntamento {

    private OffsetDateTime date;

    private String nome;

    private String note;

    public Appuntamento(OffsetDateTime date, String nome, String note) {
        this.date = date;
        this.nome = nome;
        this.note = note;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Appuntamento{" +
                "date=" + date +
                ", nome='" + nome + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public void stampaAppuntamento(){
        System.out.println("NOME:" + " " + nome + " / " + "DATA: " + " " + date + " / " + "NOTE:" + " " + note);
    }

}
