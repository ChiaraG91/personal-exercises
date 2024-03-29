public class Quadrato extends FormaGeometrica{

    private Double lato;

    public Quadrato(String colore, Double lato) {
        super(colore);
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    @Override
    public double calcoloArea() {
       return lato * lato;
    }

    @Override
    public void stampaForma() {
        System.out.println("Quadrato: " + getColore() + " - " + lato);
    }
}
