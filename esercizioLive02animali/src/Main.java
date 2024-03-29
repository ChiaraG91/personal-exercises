public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("MOby dick","Herman melville","narrativa");
        Libro libro2 = new Libro("Harry potter 1","JK Rowling","narrativa");
        Libro libro3 = new Libro("HArry potter 2","JK Rowling","narrativa");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro3);
        biblioteca.removeLibro(libro3);
        biblioteca.visualizzaListaLibri();

        System.out.println(biblioteca.ricercaAutore("Herman melville"));
    }
}