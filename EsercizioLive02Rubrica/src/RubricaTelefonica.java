import java.util.ArrayList;
import java.util.List;

public class RubricaTelefonica {

    List<Contatto> contattoList;

    public RubricaTelefonica() {
        this.contattoList = new ArrayList<>();
    }

    public List<Contatto> getContattoList() {
        return contattoList;
    }

    public void addRubrica(Contatto contatto){
        contattoList.add(contatto);
    }

    public void removeRubrica(Contatto contatto){
        contattoList.remove(contatto);
    }

    public void stampaLista(){
        for(Contatto contatto : contattoList){
            contatto.infoContatto();
        }
    }

    public List<String> ricercaNome(String nome){
        List<String> listNome = new ArrayList<>();
        for (Contatto contatto : contattoList) {
            if (contatto.getNome().contains(nome)) {
               listNome.add(nome);
            }
        }
        return listNome;
    }

    public List<Contatto> ricercaNumero(String numeroTelefonico){
        List<Contatto> listNumero = new ArrayList<>();
        for (Contatto contatto : contattoList) {
            if (film.getAnnoUscita().equals(annoUscita)) {
                listFilmAnno.add(film);
            }
        }
        return listFilmAnno;
    }
}
