import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Cerchio cerchio = new Cerchio("Verde",4.0);
        Quadrato quadrato = new Quadrato("Rosso",4.0);

        System.out.println(cerchio.calcoloArea());
        System.out.println(quadrato.calcoloArea());

        GestoreForme listaForme = new GestoreForme();
        listaForme.addForma(cerchio);
        listaForme.addForma(quadrato);

        listaForme.stampaListaForme();
        listaForme.calcoloAreaTotale();

    }
}