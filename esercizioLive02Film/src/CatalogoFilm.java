import java.util.ArrayList;
import java.util.List;

public class CatalogoFilm {

    List<Film> filmList;

    public CatalogoFilm() {
        this.filmList =new ArrayList<>();
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    public void addFilm(Film film){
        filmList.add(film);
    }

    public void removeFilm(Film film){
        filmList.remove(film);
    }

    public void stampaListaFilm(){
        for(Film film : filmList){
            film.stampaDettagli();
        }
    }

    public List<Film> ricercaFilmRegista(String regista){
        List<Film> listFilmRegista = new ArrayList<>();
        for (Film film : filmList) {
            if (film.getRegista().contains(regista)) {
                listFilmRegista.add(film);
            }
        }
        return listFilmRegista;
    }

    public List<Film> ricercaFilmAnno(Integer annoUscita){
      List<Film> listFilmAnno = new ArrayList<>();
        for (Film film : filmList) {
            if (film.getAnnoUscita().equals(annoUscita)) {
                listFilmAnno.add(film);
            }
        }
        return listFilmAnno;
    }
}
