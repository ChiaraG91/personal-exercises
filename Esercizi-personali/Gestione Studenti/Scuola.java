import java.util.Arrays;

public class Scuola {

    public String nomeScuola;

    public int numStudenti;

    public Studenti[] listaStudenti;

    public Scuola(String nomeScuola, int maxStudenti){
        this.nomeScuola = nomeScuola;
        this.listaStudenti = new Studenti[maxStudenti];
        this.numStudenti = 0;
    }

    public String getNomeScuola() {
        return nomeScuola;
    }

    public int getNumStudenti() {
        return numStudenti;
    }

    public Studenti[] getListaStudenti() {
        return listaStudenti;
    }

    public void setNomeScuola(String nomeScuola) {
        this.nomeScuola = nomeScuola;
    }

    public void setNumStudenti(int numStudenti) {
        this.numStudenti = numStudenti;
    }

    public void setListaStudenti(Studenti[] listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    public void aggiungiStudente(Studenti studente){
        if(numStudenti < listaStudenti.length){
            listaStudenti[numStudenti] = studente;
            numStudenti++;
        } else{
            System.out.println("Non è possibile aggiungere lo studente");
        }
    }

    public void visualizzaInformazioneStudenti(){
        int i;
        for(i = 0; i <= numStudenti; i++){
            listaStudenti[i].stampaDettaglio();
        }
    }

    public double mediaTotale(){
        int i;
        double totale = 0;
        for(i = 0; i < numStudenti; i++){
            totale += listaStudenti[i].getMediaVoti();
        }
            return totale;
    }



    @Override
    public String toString() {
        return "Scuola{" +
                "nomeScuola='" + nomeScuola + '\'' +
                ", numStudenti=" + numStudenti +
                ", listaStudenti=" + Arrays.toString(listaStudenti) +
                '}';
    }
}
