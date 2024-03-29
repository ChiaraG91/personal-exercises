import java.util.*;

public class Registro {

    private Map<String,Studente> mappaStudenti;

    public Registro() {
        this.mappaStudenti = new HashMap<>();
    }

    public Map<String, Studente> getMappaStudenti() {
        return mappaStudenti;
    }

    public void addStudente(Studente studente){
        mappaStudenti.put(studente.getMatricola(),studente);
    }

    public void removeStudente(String matricola){
        mappaStudenti.remove(matricola);
    }

    public void visualizzaElencoStudenti(){
        for(Map.Entry<String,Studente> entry : mappaStudenti.entrySet()){
            entry.getValue().stampaInfo();
        }
    }

    public Studente getStudenteFromMatricola(String matricola){
        return mappaStudenti.get(matricola);
    }

    public void numeroTotaleStudenti(){
        Integer numeroStudenti = 0;
        for(Map.Entry<String,Studente> entry : mappaStudenti.entrySet()){
            numeroStudenti = numeroStudenti + 1;
        }
        System.out.println(numeroStudenti);
    }

    public Integer etamediastudenti(){
        Integer sommaEta = 0;
        for(Map.Entry<String,Studente> entry : mappaStudenti.entrySet()){
            sommaEta = entry.getValue().calcolaAnnoDiNascita(); ;

        }
        Integer media = sommaEta / mappaStudenti.size();
        return media;
    }


    public void ordinaStudenti(){
        List<Studente> studenteList = new ArrayList<>(mappaStudenti.values());
        studenteList.sort(Comparator.comparing(Studente::getAnnoDiNascita));
        for (Studente studente : studenteList){
            studente.stampaInfo();
        }
    }

}
