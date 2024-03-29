import java.util.ArrayList;
import java.util.List;

public class GestoreDipendenti {

    List<Dipendente> dipendenteList;

    public GestoreDipendenti() {
        this.dipendenteList = new ArrayList<>();
    }

    public List<Dipendente> getDipendenteList() {
        return dipendenteList;
    }

    public void addDipendente(Dipendente dipendente){
        dipendenteList.add(dipendente);
    }

    public void stampaListaDipendenti(){
        for(Dipendente dipendente : dipendenteList){
            dipendente.stampaInfoDipendente();
        }
    }

    public void stampaSommaSalari(){
        double somma = 0.0;
        for(Dipendente dipendente : dipendenteList){
            somma += dipendente.getSalario();
        }
        System.out.println(somma);
        System.out.println(somma * 12);
    }
}
