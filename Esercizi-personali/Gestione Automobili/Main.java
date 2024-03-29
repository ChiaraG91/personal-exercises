public class Main {

    public static void main(String[] args){

        Automobile auto1 = new Automobile("Chrevolet","Impala 1967",50299.50);
        Automobile auto2 = new Automobile("Chrevolet","Bel Air 1958",30264.82);
        Automobile auto3 = new Automobile("Chrevolet","Camaro 1966",56924.45);
        Automobile auto4 = new Automobile("Chrevolet","Chevelle 1970",32451.96);

        Concessionario concessionario1 = new Concessionario("Autosalone",450);

        concessionario1.aggiungiAuto(auto1);
        concessionario1.aggiungiAuto(auto2);
        concessionario1.aggiungiAuto(auto3);
        concessionario1.aggiungiAuto(auto4);

        auto1.stampaDettaglio();
        auto2.stampaDettaglio();
        auto3.stampaDettaglio();
        auto4.stampaDettaglio();


        System.out.println(concessionario1.prezzoTotale());

    }
}
