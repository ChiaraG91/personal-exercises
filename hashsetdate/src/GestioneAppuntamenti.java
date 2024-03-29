import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class GestioneAppuntamenti {

    private ArrayList<Appuntamento> appuntamenti;

    public GestioneAppuntamenti() {
        this.appuntamenti = new ArrayList<>();
    }

    public ArrayList<Appuntamento> getAppuntamenti() {
        return appuntamenti;
    }

    public void setAppuntamenti(ArrayList<Appuntamento> appuntamenti) {
        this.appuntamenti = appuntamenti;
    }

    public void addAppuntamenti(Appuntamento appuntamentoNuovo) throws Exception {
        boolean nonPresente = true;
        for(Appuntamento appuntamento : appuntamenti){
            if(appuntamento.getDate().equals(appuntamentoNuovo.getDate())){
                nonPresente = false;
            }
        }
        if(nonPresente){
            appuntamenti.add(appuntamentoNuovo);
            System.out.println("L'appuntamento è stato aggiunto");
        }  else{
            throw new RuntimeException("Appuntamento già presente");
        }
    }

    public void removeAppuntamenti(Appuntamento appuntamentoGiaPresente) {
        boolean nonPresente = false;
        for(Appuntamento appuntamento : appuntamenti){
            if(appuntamento.getDate().equals(appuntamentoGiaPresente)){
                nonPresente = false;
            } else{
                nonPresente = true;
            }
        }
        if(nonPresente){
            appuntamenti.remove(appuntamentoGiaPresente);
            System.out.println("L'appuntamento è stato rimosso");
        }


    }

    public void mostraListaAppuntamenti(){
        for (Appuntamento appuntamento : appuntamenti){
           appuntamento.stampaAppuntamento();
        }
    }

    public void controlloListaVuota(){
        System.out.println(appuntamenti.isEmpty() ? "La lista è vuota" : "Sono presenti appuntamenti nella lista");
    }

}
