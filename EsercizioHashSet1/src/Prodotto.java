import java.util.Objects;

public class Prodotto {

    public Integer id;

    public String nome;

    public Double prezzo;

    public Prodotto(Integer id, String nome, Double prezzo) {
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodotto that = (Prodotto) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(prezzo, that.prezzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, prezzo);
    }
}
