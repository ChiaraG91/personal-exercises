public class FormaGeometrica {

    private String colore;

    public FormaGeometrica(String colore) {
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    @Override
    public String toString() {
        return "FormaGeometrica{" +
                "colore='" + colore + '\'' +
                '}';
    }

    public double calcoloArea(){
        return 0.0;
    }

    public void stampaForma(){
        System.out.println();
    }
}
