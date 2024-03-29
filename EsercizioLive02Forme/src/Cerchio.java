public class Cerchio extends FormaGeometrica{

    private Double raggio;

    public Cerchio(String colore,Double raggio) {
        super(colore);
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcoloArea() {
        return ((raggio * raggio) * Math.PI);
    }

    @Override
    public void stampaForma() {
        System.out.println("Cerchio: " + getColore() + " - " + raggio);
    }
}
