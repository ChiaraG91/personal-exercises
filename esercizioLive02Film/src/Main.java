public class Main {
    public static void main(String[] args) {

        Film film1 = new Film("Rambo 1 ","Ted Kotcheff",1982,5);
        Film film2 = new Film("Rambo 2"," George Pan Cosmatos",1985,4);
        Film film3 = new Film("Rambo 3", "Peter MacDonald",1988,5);

        CatalogoFilm catalogoFilm = new CatalogoFilm();
        catalogoFilm.addFilm(film1);
        catalogoFilm.addFilm(film2);
        catalogoFilm.addFilm(film3);

        catalogoFilm.stampaListaFilm();

        System.out.println(catalogoFilm.ricercaFilmAnno(1988));
        System.out.println(catalogoFilm.ricercaFilmRegista("Ted Kotcheff"));
    }
}