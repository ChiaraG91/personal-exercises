import java.io.InvalidObjectException;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) throws InvalidObjectException {

        try{
        Evento Riunione1 = new Riunione(OffsetDateTime.parse("2024-01-15T10:00:00+00:00"),"Riunione progetto");
        Evento Appuntamento1 = new Appuntamento(OffsetDateTime.parse("2024-01-16T10:00:00+00:00"),"Presentazione progetto");
        Evento Promemoria1 = new Promemoria(OffsetDateTime.parse("2024-01-18T10:00:00+00:00"),"Visita dentistica");
        Evento Riunione2 = new Riunione(OffsetDateTime.parse("2024-01-25T11:00:00+00:00"),"Riunione progetto nuovo");
        Evento Appuntamento2 = new Appuntamento(OffsetDateTime.parse("2024-02-15T12:00:00+00:00"), "Incontro nuovo cliente");
        Evento Promemoria2 = new Promemoria(OffsetDateTime.parse("2024-03-15T18:00:00+00:00"),"Aperitivo");

        GestioneEventi listaEventi = new GestioneEventi();
        listaEventi.aggiungiEvento(Riunione1);
        listaEventi.aggiungiEvento(Appuntamento1);
        listaEventi.aggiungiEvento(Promemoria1);
        listaEventi.aggiungiEvento(Riunione2);
        listaEventi.aggiungiEvento(Appuntamento2);
        listaEventi.aggiungiEvento(Promemoria2);

        listaEventi.stampaDettagliEventi();
        System.out.println("-----------------------------");
        listaEventi.filtraEventiFuturi();
        System.out.println("-----------------------------");
        listaEventi.ordinaDataOra();


        } catch (Exception e) {
            throw new InvalidObjectException(e.getMessage());
        }
    }
}