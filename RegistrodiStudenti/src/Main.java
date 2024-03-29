public class Main {
    public static void main(String[] args) {

        Studente studente1 = new Studente("06483653627","mario","rossi",1995);
        Studente studente2 = new Studente("05685248455","luca","verdi",1995);
        Studente studente3 = new Studente("05698712543","giulia","bianchi",1995);
        Studente studente4 = new Studente("04887623652","lucia","rossa",1995);

        System.out.println(studente1.calcolaAnnoDiNascita());
        System.out.println(studente2.calcolaAnnoDiNascita());
        System.out.println(studente3.calcolaAnnoDiNascita());
        System.out.println(studente4.calcolaAnnoDiNascita());
        System.out.println();
        Registro registroStudenti = new Registro();
        registroStudenti.addStudente(studente1);
        registroStudenti.addStudente(studente2);
        registroStudenti.addStudente(studente3);
        registroStudenti.addStudente(studente4);

        registroStudenti.visualizzaElencoStudenti();
        System.out.println();
        registroStudenti.getStudenteFromMatricola(studente1.getMatricola()).stampaInfo();
        registroStudenti.getStudenteFromMatricola(studente2.getMatricola()).stampaInfo();
        registroStudenti.getStudenteFromMatricola(studente3.getMatricola()).stampaInfo();
        registroStudenti.getStudenteFromMatricola(studente4.getMatricola()).stampaInfo();

        registroStudenti.numeroTotaleStudenti();
        System.out.println();
        System.out.println(registroStudenti.etamediastudenti());
        registroStudenti.ordinaStudenti();
    }
}