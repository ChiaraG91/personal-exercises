public enum TipoEventoEnum {

    RIUNIONE("riunione"),

    APPUNTAMENTO("appuntamento"),

    PROMEMORIA("promemoria");

    public final String tipoEventoEnum;

    TipoEventoEnum(String tipoEventoEnum) {
        this.tipoEventoEnum = tipoEventoEnum;
    }

    public String getTipoEventoEnum() {
        return tipoEventoEnum;
    }
}
