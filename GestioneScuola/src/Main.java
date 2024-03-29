import java.io.InvalidObjectException;

public class Main {
    public static void main(String[] args) throws InvalidObjectException {

        try {
            Studente studente1 = new Studente("Mario", "Rossi", 1);
            Studente studente2 = new Studente("Martina", "Bianchi", 2);
            Studente studente3 = new Studente("Luca", "Verdi", 3);
            Studente studente4 = new Studente("Laura", "Rosso", 4);
            Studente studente5 = new Studente("Giulia", "Bianco", 5);
            Studente studente6 = new Studente("Matteo", "Verde", 6);

            Corso italiano = new Corso("Italiano", 001, "Professore Uno");
            Corso matematica = new Corso("Matematica", 002, "Professore Due");
            Corso storia = new Corso("Storia", 003, "Professore Uno");
            Corso geografia = new Corso("Geografia", 004, "Professore Uno");
            Corso fisica = new Corso("Fisica", 005, "Professore Due");

            Insegnante insegnante1 = new Insegnante("Professore", "Uno");
            Insegnante insegnante2 = new Insegnante("Professore", "Due");

            studente1.stampaInfoStudente();

            studente1.aggiungiCorso(italiano);
            studente1.aggiungiCorso(storia);
            studente1.aggiungiCorso(geografia);
            studente2.aggiungiCorso(italiano);
            studente3.aggiungiCorso(storia);
            studente4.aggiungiCorso(matematica);
            studente5.aggiungiCorso(geografia);
            studente6.aggiungiCorso(fisica);

            studente1.stampaListaCorsi();

            studente1.aggiungiVoto(italiano, new Voto(7.0));
            studente1.aggiungiVoto(storia, new Voto(9.5));

            studente1.stampaRegistro();
            studente1.stampaMediaVoti();

            insegnante1.aggiungiCorso(italiano);
            insegnante1.aggiungiCorso(storia);
            insegnante1.aggiungiCorso(geografia);
            insegnante2.aggiungiCorso(matematica);
            insegnante2.aggiungiCorso(fisica);

            insegnante1.stampaInfoInsegnante();

            insegnante1.stampaListaCorsiInsegnante();

            italiano.stampaInfoCorso();

            insegnante1.aggiungiVotoStudente(studente1,new Voto(7.5));
            insegnante2.aggiungiVotoStudente(studente4,new Voto(8.5));
            insegnante1.stampaRegistro();

        } catch (Exception e) {
            throw new InvalidObjectException(e.getMessage());
        }
    }
}