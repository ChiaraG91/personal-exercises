public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Paolo",2500.00,3);
        Manager manager2 = new Manager("Luca",3000.00,6);
        Sviluppatore sviluppatore1 = new Sviluppatore("Matteo",1500.00,1);
        Sviluppatore sviluppatore2 = new Sviluppatore("Giovanni",2000.00,1);

        sviluppatore1.stampaInfoDipendente();
        manager1.stampaInfoDipendente();

        sviluppatore1.calcolaSalarioAnnuo();
        sviluppatore2.calcolaSalarioAnnuo();

        manager1.calcolaSalarioAnnuo();
        manager2.calcolaSalarioAnnuo();

        GestoreDipendenti gestoreDipendenti = new GestoreDipendenti();
        gestoreDipendenti.addDipendente(manager1);
        gestoreDipendenti.addDipendente(manager2);
        gestoreDipendenti.addDipendente(sviluppatore1);
        gestoreDipendenti.addDipendente(sviluppatore2);

        gestoreDipendenti.stampaSommaSalari();
    }
}