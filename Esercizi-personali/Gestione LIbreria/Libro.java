public class Libro {

    public String titolo;

    public String autore;

    public int numeroPagine;

    public Libro(String titolo, String autore, int numeroPagine){
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", numeroPagine=" + numeroPagine +
                '}';
    }



    public void stampaDettagli(){
        System.out.println("Titolo:" + " " + titolo + "/" + "Autore:" + " " + autore + "/" + "numero delle pagine:" + " " + numeroPagine);
    }
}
