
public class Main {
    public static void main(String[] args) {

        gestioneRegistro();
    }

    public static void gestioneRegistro(){

        Registrostudenti registro1 = new Registrostudenti();


        System.out.println("Aggiungere uno studente al registro");
        registro1.aggiungiStudente(new Studente(01,"Giovanni",7.5));
        registro1.aggiungiStudente(new Studente(02,"Mario",8.0));
        registro1.aggiungiStudente(new Studente(03,"Luca",9.5));
        registro1.aggiungiStudente(new Studente(04,"Mario",6.5));

        System.out.println("Visualizzare tutti gli studenti nel registro");
        registro1.visualizzaStudente();

        System.out.println("Modificare il voto di uno studente");
        System.out.println("Rimuovere uno studente dal registro");
        registro1.rimuoviStudente(03);
        registro1.visualizzaStudente();

        System.out.println("Uscire dal programma");
    }
}