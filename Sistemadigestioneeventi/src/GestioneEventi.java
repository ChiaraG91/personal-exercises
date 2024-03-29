import java.time.OffsetDateTime;
import java.util.*;

public class GestioneEventi {
    private ArrayList<Evento> listaEventi;

    public GestioneEventi() {
        this.listaEventi = new ArrayList<>();
    }

    public ArrayList<Evento>getListaEventi() {
        return listaEventi;
    }

    public void setListaEventi(ArrayList<Evento> listaEventi) {
        this.listaEventi = listaEventi;
    }

    public void stampaDettagliEventi(){
        for(Evento evento : listaEventi){
            System.out.println(evento.getTipo() + ": " + evento.getDataOra());
        }
    }


    public void aggiungiEvento(Evento eventoNuovo) throws Exception{
        boolean nonPresente = true;
        for(Evento evento : listaEventi){
            if(evento.getDataOra().equals(eventoNuovo.getDataOra())){
                nonPresente = false;
            }
        }
        if(nonPresente){
            listaEventi.add(eventoNuovo);
            System.out.println("L'evento è stato aggiunto");
        }  else{
            throw new RuntimeException("Evento già presente");
        }
    }

    public void ordinaDataOra(){
        listaEventi.sort(Comparator.comparing(Evento::getDataOra));
            stampaDettagliEventi();
    }

    public ArrayList<Evento> filtraEventiFuturi() {
        OffsetDateTime now = OffsetDateTime.now();
        ArrayList<Evento> eventiFuturi = new ArrayList<>();
        for (Evento evento : listaEventi) {
            if (evento.getDataOra().isAfter(now)) {
                eventiFuturi.add(evento);
                System.out.println(evento.getTipo() + ": " + evento.getDataOra());
            }
        }
        return eventiFuturi;

    }


}
