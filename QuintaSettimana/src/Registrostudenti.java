import java.util.*;

public class Registrostudenti {

    private List<Studente> listaStudenti = new ArrayList<>();

    public Registrostudenti() {
    }

    public List<Studente> getListaStudenti() {
        return listaStudenti;
    }

    public void setListaStudenti(List<Studente> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    @Override
    public String toString() {
        return "Registrostudenti{" +
                "listaStudenti=" + listaStudenti +
                '}';
    }

    public void aggiungiStudente(Studente studente){
        if(studente.equals(studente.getId())){
            System.out.println("Lo studente non è stato aggiunto");
        } else {
            listaStudenti.add(studente);
            System.out.println("Lo studente è stato aggiunto");
        }

    }

    public void rimuoviStudente(Integer id){
        listaStudenti.remove(id);
        System.out.println("Lo studente è stato rimosso");
    }

    public void visualizzaStudente(){
        for(Studente studente: listaStudenti){
            System.out.println("ID: " + studente.getId() + " / " + "NOME: " + studente.getNome() + " / " + "VOTO:" + studente.getVoto());
        }
    }
}
