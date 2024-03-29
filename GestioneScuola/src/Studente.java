import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Studente {

    private String nomeStudente;
    private String cognomeStudente;
    private Integer numeroMatricola;
    private List<Corso> listaCorsiStudente;

    private Map<Corso,Voto> registroPersonaleStudente;

    public Studente(String nomeStudente, String cognomeStudente, Integer numeroMatricola) {
        this.nomeStudente = nomeStudente;
        this.cognomeStudente = cognomeStudente;
        this.numeroMatricola = numeroMatricola;
        this.listaCorsiStudente = new ArrayList<>();
        this.registroPersonaleStudente = new HashMap<>();
    }

    public String getNomeStudente() {
        return nomeStudente;
    }

    public void setNomeStudente(String nomeStudente) {
        this.nomeStudente = nomeStudente;
    }

    public String getCognomeStudente() {
        return cognomeStudente;
    }

    public void setCognomeStudente(String cognomeStudente) {
        this.cognomeStudente = cognomeStudente;
    }

    public Integer getNumeroMatricola() {
        return numeroMatricola;
    }

    public void setNumeroMatricola(Integer numeroMatricola) {
        this.numeroMatricola = numeroMatricola;
    }

    public List<Corso> getlistaCorsiStudente() {
        return listaCorsiStudente;
    }

    public void setListaCorsiStudente(List<Corso> listaCorsiStudente) {
        this.listaCorsiStudente = listaCorsiStudente;
    }

    public Map<Corso, Voto> getRegistroPersonaleStudente() {
        return registroPersonaleStudente;
    }

    public void setRegistroPersonaleStudente(Map<Corso, Voto> registroPersonaleStudente) {
        this.registroPersonaleStudente = registroPersonaleStudente;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nomeStudente='" + nomeStudente + '\'' +
                ", cognomeStudente='" + cognomeStudente + '\'' +
                ", numeroMatricola=" + numeroMatricola +
                ", listaCorsiStudente=" + listaCorsiStudente +
                ", registroPersonaleStudente=" + registroPersonaleStudente +
                '}';
    }

    public void stampaMediaVoti(){
        System.out.println();
        Double somma = 0.0;
        double mediaVoti = 0.0;
        for(Map.Entry<Corso,Voto> entry : registroPersonaleStudente.entrySet()){
            somma += entry.getValue().getVotoCorso();
            mediaVoti = somma/registroPersonaleStudente.size();
        }
         System.out.println("Media voti dello studente: " + mediaVoti);
    }


    public void aggiungiCorso(Corso corso) throws Exception{
        if(!listaCorsiStudente.contains(corso)){
            listaCorsiStudente.add(corso);
        } else{
            throw new Exception("Il corso è già presente");
        }

    }

    public void rimuoviCorso(Corso corso){
        listaCorsiStudente.remove(corso);
    }

    public void stampaInfoStudente(){
        System.out.println("Studente: " + nomeStudente + " - " + cognomeStudente + " - " + numeroMatricola);
    }

    public void stampaListaCorsi(){
        System.out.println();
        System.out.println("Lista dei corsi dello studente:");
        for (Corso corso : listaCorsiStudente) {
            System.out.println("Corso: " + corso.getNomeCorso() + " - " + corso.getCodiceCorso() + " - " + corso.getInsegnante());
        }

    }

    public void aggiungiVoto(Corso corso, Voto voto) throws Exception {
        if(!registroPersonaleStudente.containsKey(corso.getCodiceCorso())){
            registroPersonaleStudente.put(corso,voto);
        } else{
            throw new Exception("Voto già aggiunto");
        }
    }

    public void stampaRegistro(){
        System.out.println();
        System.out.println("Registro dei voti dello studente:");
        for (Map.Entry <Corso,Voto> materia: registroPersonaleStudente.entrySet()) {
            System.out.println("Corso: " + materia.getKey().getNomeCorso() + " - " + "Voto: " + materia.getValue());
        }
    }
}




