public class Main {
    public static void main(String[] args){

        Libro libro1 = new Libro("Piccole Donne","Louisa May Alcott", 322);
        Libro libro2 = new Libro("Piccole Donne Crescono", "Louisa May Alcott", 325);
        Libro libro3 = new Libro("I Ragazzi di Jo","Louisa May Alcott", 330);


        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Centrale", 5000);


        biblioteca1.aggiungiLibro(libro1);
        biblioteca1.aggiungiLibro(libro2);
        biblioteca1.aggiungiLibro(libro3);

        libro1.stampaDettagli();
        libro2.stampaDettagli();
        libro3.stampaDettagli();

        System.out.println(biblioteca1.numTotalePagine());


    }

}
