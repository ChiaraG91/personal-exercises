import java.util.Arrays;

public class Biblioteca {

    public String nomeBiblioteca;

    public int numLibri;

    public Libro[] listaLibri;

    public Biblioteca(String nomeBiblioteca, int maxLibri){
        this.nomeBiblioteca = nomeBiblioteca;
        this.listaLibri = new Libro[maxLibri];
        this.numLibri = 0;

    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public int getNumLibri() {
        return numLibri;
    }

    public Libro[] getListaLibri() {
        return listaLibri;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public void setNumLibri(int numLibri) {
        this.numLibri = numLibri;
    }

    public void setListaLibri(Libro[] listaLibri) {
        this.listaLibri = listaLibri;
    }


    public void aggiungiLibro(Libro libro){
        if(numLibri < listaLibri.length){
            listaLibri[numLibri] = libro;
            numLibri++;
        } else{
            System.out.println("Non è possibile aggiungere il libro");
        }
    }


    public void visualizzaInformazioniLibro(){
        int i;
        for(i = 0; i <= numLibri; i++){
            listaLibri[i].stampaDettagli();
        }
    }


    public int numTotalePagine(){
        int i;
        int totalePagine = 0;
        if (numLibri != 0){
            for(i = 0; i < numLibri; i++){
                totalePagine += listaLibri[i].getNumeroPagine();
            }
        }  return totalePagine;
    }



    @Override
    public String toString() {
        return "Biblioteca{" +
                "nomeBiblioteca='" + nomeBiblioteca + '\'' +
                ", numLibri=" + numLibri +
                ", listaLibri=" + Arrays.toString(listaLibri) +
                '}';
    }

}
