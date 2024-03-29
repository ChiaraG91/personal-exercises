import java.util.*;

public class Main {
    public static void main(String[] args) {

        elementi();
    }


    public static void elementi(){
        List<Prodotto> listaProdotti = new ArrayList<>();
        listaProdotti.add(new Prodotto(01,"Penna",5.50));
        listaProdotti.add(new Prodotto(02,"Matita",5.50));
        listaProdotti.add(new Prodotto(01,"Penna",5.50));
        listaProdotti.add(new Prodotto(02,"Matita",5.50));
        listaProdotti.add(new Prodotto(01,"Penna",5.50));

        List<Prodotto> listaProdotti = rimuoviDuplicati(listaProdotti);

        for (Prodotto prodotto : listaProdotti) {
            System.out.println(prodotto.getId() + " " + prodotto.getNome() + " " + prodotto.getPrezzo());
        }
    }


}