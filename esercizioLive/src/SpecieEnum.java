public enum SpecieEnum {

    MAMMIFERI ("mammifero"),

    ANFIBIO ("anfibio"),

    RETTILE ("RETTILE");

    private final String descrizione;

    SpecieEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }


}
