public class Main {

    public static void main(String[] args){

        Studenti studente1 = new Studenti("Paolo","Rossi",4.50);
        Studenti studente2 = new Studenti("Luca","Bianchi",8.50);
        Studenti studente3 = new Studenti("Giulia","Verdi",9.50);


       Scuola scuola1 = new Scuola("Liceo Parini",500);


       scuola1.aggiungiStudente(studente1);
       scuola1.aggiungiStudente(studente2);
       scuola1.aggiungiStudente(studente3);

       studente1.stampaDettaglio();
       studente2.stampaDettaglio();
       studente3.stampaDettaglio();


       System.out.println(scuola1.mediaTotale());
    }

}
