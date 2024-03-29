import java.util.ArrayList;
import java.util.List;

public class SistemaOrdini {

    private List<Ordine> ordineList;

    public SistemaOrdini() {
        this.ordineList = new ArrayList<>();
    }

    public List<Ordine> getOrdineList() {
        return ordineList;
    }

    public void addOrdine(Ordine ordine){
        ordineList.add(ordine);
    }

    public void removeOrdine(Ordine ordine){
        ordineList.remove(ordine);
    }

    public void visualizzaListaOrdini(){
        for(Ordine ordine : ordineList){
            ordine.stampaInfoOrdine();
        }
    }

    public void modificaStato(Ordine ordine){
        ordine.setStatoElaborazione("Completato");
    }
}
