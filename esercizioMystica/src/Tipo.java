public enum Tipo {

    ACQUA ("acqua"),

    TERRA ("terra"),

    ARIA ("aria");

    public String tipo;

    Tipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
