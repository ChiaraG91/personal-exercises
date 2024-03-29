import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Insegnante {

    private String nomeInsegnante;
    private String nomeCognome;
    private List<Corso> listaCorsiInsegnante;
    private Map<Studente, Voto> registroInsegnante;

    public Insegnante(String nomeInsegnante, String nomeCognome) {
        this.nomeInsegnante = nomeInsegnante;
        this.nomeCognome = nomeCognome;
        this.listaCorsiInsegnante = new ArrayList<>();
        this.registroInsegnante = new HashMap<Studente, Voto>();
    }

    public String getNomeInsegnante() {
        return nomeInsegnante;
    }

    public void setNomeInsegnante(String nomeInsegnante) {
        this.nomeInsegnante = nomeInsegnante;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }


    public List<Corso> getListaCorsiInsegnante() {
        return listaCorsiInsegnante;
    }

    public void setListaCorsiInsegnante(List<Corso> listaCorsiInsegnante) {
        this.listaCorsiInsegnante = listaCorsiInsegnante;
    }

    @Override
    public String toString() {
        return "Insegnante{" +
                "nomeInsegnante='" + nomeInsegnante + '\'' +
                ", nomeCognome='" + nomeCognome + '\'' +
                ", listaCorsiInsegnante=" + listaCorsiInsegnante +
                '}';
    }

    public void aggiungiCorso(Corso corso) throws Exception{
        if(!listaCorsiInsegnante.contains(corso)){
            listaCorsiInsegnante.add(corso);
        } else{
            throw new Exception("Il corso è già presente");
        }
    }

    public void rimuoviCorsi(Corso corso){
        listaCorsiInsegnante.remove(corso);
    }


    public void stampaInfoInsegnante(){
        System.out.println("Insegnante: " + nomeInsegnante + " - " + nomeCognome);
    }

    public void stampaListaCorsiInsegnante(){
        System.out.println();
        System.out.println("Lista dei corsi dell'insegnante:");
        for (Corso corso : listaCorsiInsegnante) {
            System.out.println("Corso: " + corso.getNomeCorso() + " - " + corso.getCodiceCorso());
        }

    }

    public void aggiungiVotoStudente(Studente studente, Voto voto) throws Exception {
        if(!registroInsegnante.containsKey(voto.getVotoCorso())){
            registroInsegnante.put(studente, voto);
        } else{
            throw new Exception("Voto già aggiunto");
        }
    }

        public void stampaRegistro(){
            System.out.println();
            System.out.println("Registro dei voti:");
            for (Map.Entry<Studente, Voto> alunno: registroInsegnante.entrySet()) {
                System.out.println(alunno.getKey().getNomeStudente() + " " +alunno.getKey().getCognomeStudente() +  " - " + "Voto: " + alunno.getValue());
            }
        }
}

