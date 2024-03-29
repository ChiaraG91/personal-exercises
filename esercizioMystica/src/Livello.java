public enum Livello {

    COMUNE ("comune"),
    REALE ("reale"),
    RARO ("raro"),
    ULTRARARO ("ultra raro"),
    DIAMANTE ("diamante");

    public String livello;

    Livello(String livello) {
        this.livello = livello;
    }

    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }
}
