public class Automobile {

    public String marca;

    public String modello;

    public double prezzo;

    public Automobile(String marca, String modello, double prezzo){
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }

    public void stampaDettaglio(){
        System.out.println("marca:" + "" + marca + "/" + "modello:" + "" + modello + "/" + "prezzo:" + "" + prezzo);
    }
}
