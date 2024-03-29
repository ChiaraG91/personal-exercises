import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        Ordine ordine1 = new Ordine(1, OffsetDateTime.parse("2024-03-01T13:00:00Z"));
        Ordine ordine2 = new Ordine(2, OffsetDateTime.parse("2024-03-01T13:05:00Z"));
        Ordine ordine3 = new Ordine(3, OffsetDateTime.parse("2024-03-01T13:10:00Z"));
        Ordine ordine4 = new Ordine(4, OffsetDateTime.parse("2024-03-01T13:15:00Z"));

        SistemaOrdini sistemaOrdini = new SistemaOrdini();
        sistemaOrdini.addOrdine(ordine1);
        sistemaOrdini.addOrdine(ordine2);
        sistemaOrdini.addOrdine(ordine3);
        sistemaOrdini.addOrdine(ordine4);

        sistemaOrdini.visualizzaListaOrdini();
        System.out.println();
        sistemaOrdini.modificaStato(ordine1);
        ordine1.stampaInfoOrdine();

    }
}