import java.util.ArrayList;
import java.util.List;

public class GestoreForme {

    private List<FormaGeometrica> formaGeometricaList;

    public GestoreForme() {
        formaGeometricaList = new ArrayList<>();
    }

    public List<FormaGeometrica> getFormaGeometricaList() {
        return formaGeometricaList;
    }

    public void addForma(FormaGeometrica formaGeometrica){
        formaGeometricaList.add(formaGeometrica);
    }

    public void stampaListaForme(){
        for (FormaGeometrica formaGeometrica : formaGeometricaList){
            formaGeometrica.stampaForma();
        }
    }

    public double calcoloAreaTotale(){
        double areaTotale = 0.0;
        for(FormaGeometrica formaGeometrica : formaGeometricaList){
            areaTotale = areaTotale + formaGeometrica.calcoloArea();
        }

        return areaTotale;
    }
}
