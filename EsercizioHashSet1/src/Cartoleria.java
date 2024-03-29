import java.util.*;

public class Cartoleria {

    List<Prodotto> prodotti = new ArrayList<>();

    public Cartoleria(List<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    public List<Prodotto> getProdotti() {
        return prodotti;
    }

    public void setProdotti(List<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    public static List<Prodotto> rimuoviDuplicati(List<Prodotto> prodotti) {
        if (prodotti == null || prodotti.isEmpty()) {
            // Gestione caso lista nulla o vuota
            return Collections.emptyList();
        }

        // Utilizzo di HashSet per garantire l'unicità degli oggetti
        Set<Prodotto> setProdotto = new HashSet<>(prodotti);

        // Restituzione della nuova lista con oggetti unici
        return new ArrayList<>(setProdotto);
    }
}