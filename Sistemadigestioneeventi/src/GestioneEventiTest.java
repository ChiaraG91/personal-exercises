import java.time.OffsetDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GestioneEventiTest {

    private GestioneEventi testing = new GestioneEventi();

    @org.junit.jupiter.api.Test
    void aggiungiEvento() throws Exception {
        Evento Riunione2 = new Riunione(OffsetDateTime.parse("2024-01-25T11:00:00+00:00"),"Riunione progetto nuovo");
        Evento Appuntamento2 = new Appuntamento(OffsetDateTime.parse("2024-02-15T12:00:00+00:00"), "Incontro nuovo cliente");
        Evento Promemoria2 = new Promemoria(OffsetDateTime.parse("2024-03-15T18:00:00+00:00"),"Aperitivo");

        GestioneEventi listaEventi = new GestioneEventi();
        listaEventi.aggiungiEvento(Riunione2);
        listaEventi.aggiungiEvento(Appuntamento2);
        listaEventi.aggiungiEvento(Promemoria2);

        ArrayList<Evento> eventiAggiunti = listaEventi.filtraEventiFuturi();
        assertEquals(3, listaEventi.filtraEventiFuturi().size());
        assertEquals(Riunione2,eventiAggiunti.get(0));
        assertEquals(Appuntamento2, eventiAggiunti.get(1));
        assertEquals(Promemoria2, eventiAggiunti.get(2));
    }

    @org.junit.jupiter.api.Test
    void ordinaDataOra() throws Exception {
        Evento Riunione2 = new Riunione(OffsetDateTime.parse("2024-01-25T11:00:00+00:00"),"Riunione progetto nuovo");
        Evento Appuntamento2 = new Appuntamento(OffsetDateTime.parse("2024-02-15T12:00:00+00:00"), "Incontro nuovo cliente");
        Evento Promemoria2 = new Promemoria(OffsetDateTime.parse("2024-03-15T18:00:00+00:00"),"Aperitivo");

        GestioneEventi listaEventi = new GestioneEventi();
        listaEventi.aggiungiEvento(Riunione2);
        listaEventi.aggiungiEvento(Appuntamento2);
        listaEventi.aggiungiEvento(Promemoria2);

        ArrayList<Evento> eventiOrdinati = listaEventi.filtraEventiFuturi();

        assertEquals(3, eventiOrdinati.size());
        assertEquals(Riunione2, eventiOrdinati.get(0));
        assertEquals(Appuntamento2, eventiOrdinati.get(1));
        assertEquals(Promemoria2, eventiOrdinati.get(2));
    }

    @org.junit.jupiter.api.Test
    void filtraEventiFuturi() throws Exception {
        OffsetDateTime now = OffsetDateTime.now();
        OffsetDateTime dataOraPassata = now.minusDays(1);
        OffsetDateTime dataOraFutura = now.plusDays(7);

        Promemoria riunionePassata = new Promemoria(OffsetDateTime.parse("2024-01-18T10:00:00+00:00"),"Visita dentistica");
        Riunione riunioneFutura = new Riunione(OffsetDateTime.parse("2024-01-25T11:00:00+00:00"),"Riunione progetto nuovo");

        GestioneEventi listaEventi = new GestioneEventi();
        listaEventi.aggiungiEvento(riunionePassata);
        listaEventi.aggiungiEvento(riunioneFutura);

        ArrayList<Evento> eventiFuturi = listaEventi.filtraEventiFuturi();

        assertEquals(1, eventiFuturi.size());
        assertEquals(riunioneFutura, eventiFuturi.get(0));
    }
}