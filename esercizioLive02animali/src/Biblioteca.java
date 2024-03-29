import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    List<Libro> libroList;

    public Biblioteca() {
        this.libroList = new ArrayList<>();
    }

    public List<Libro> getLibroList() {
        return libroList;
    }

    public void addLibro(Libro libro){
        libroList.add(libro);
    }

    public void removeLibro(Libro libro){
        libroList.remove(libro);
    }

    public void visualizzaListaLibri(){
        for (Libro libro : libroList){
            libro.stampaInformazioni();
        }
    }

    public List<Libro> ricercaAutore(String autore){
        List<Libro> libroListAutore = new ArrayList<>();
        for (Libro libro : libroList){
            if(libro.getAutore().contains(autore)){
                libroListAutore.add(libro);
            }

        }
        return libroListAutore;
    }
}
