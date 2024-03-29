import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        GestioneAppuntamenti gestioneAppuntamenti = new GestioneAppuntamenti();


        try{
            Appuntamento appuntamento1 = new Appuntamento(OffsetDateTime.parse("2023-12-20T18:00:00Z"),"Mario","Appuntamento medico");
            Appuntamento appuntamento2 = new Appuntamento(OffsetDateTime.parse("2023-12-21T14:00:00Z"),"Luca","Appuntamento medico");
            Appuntamento appuntamento3 = new Appuntamento(OffsetDateTime.parse("2023-12-22T15:00:00Z"),"Giulia","Appuntamento medico");
            Appuntamento appuntamento4 = new Appuntamento(OffsetDateTime.parse("2023-12-23T17:00:00Z"),"Laura","Appuntamento medico");



            gestioneAppuntamenti.addAppuntamenti(appuntamento1);
            gestioneAppuntamenti.mostraListaAppuntamenti();

            gestioneAppuntamenti.addAppuntamenti(appuntamento2);
            gestioneAppuntamenti.addAppuntamenti(appuntamento3);
            gestioneAppuntamenti.addAppuntamenti(appuntamento4);

            gestioneAppuntamenti.mostraListaAppuntamenti();
            gestioneAppuntamenti.removeAppuntamenti(appuntamento1);
            gestioneAppuntamenti.mostraListaAppuntamenti();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        gestioneAppuntamenti.controlloListaVuota();





    }
}