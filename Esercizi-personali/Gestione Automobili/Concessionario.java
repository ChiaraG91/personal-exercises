import java.util.Arrays;

public class Concessionario {

    public String nomeConcessionario;

    public int numAuto;

    public Automobile[] listaAuto;

    public Concessionario(String nomeConcessionario, int maxAuto){
        this.nomeConcessionario = nomeConcessionario;
        this.listaAuto = new Automobile[maxAuto];
        this.numAuto = 0;
    }

    public String getNomeConcessionario() {
        return nomeConcessionario;
    }

    public int getNumAuto() {
        return numAuto;
    }

    public Automobile[] getListaAuto() {
        return listaAuto;
    }

    public void setNomeConcessionario(String nomeConcessionario) {
        this.nomeConcessionario = nomeConcessionario;
    }

    public void setNumAuto(int numAuto) {
        this.numAuto = numAuto;
    }

    public void setListaAuto(Automobile[] listaAuto) {
        this.listaAuto = listaAuto;
    }


    public void aggiungiAuto(Automobile automobile){
        if(numAuto < listaAuto.length){
            listaAuto[numAuto] = automobile ;
            numAuto++;
        } else{
            System.out.println("Non è possibile aggiungere l'auto");
        }
    }

    public void visualizzaInformazioneAuto(){
        int i;
        for(i = 0; i <= numAuto; i++){
            listaAuto[i].stampaDettaglio();
        }
    }

    public double prezzoTotale(){
        int i;
        double totale = 0;
        for(i = 0; i < numAuto; i++){
            totale += listaAuto[i].getPrezzo();
        }
            return totale;
    }


    @Override
    public String toString() {
        return "Concessionario{" +
                "nomeConcessionario='" + nomeConcessionario + '\'' +
                ", numAuto=" + numAuto +
                ", listaAuto=" + Arrays.toString(listaAuto) +
                '}';
    }
}
