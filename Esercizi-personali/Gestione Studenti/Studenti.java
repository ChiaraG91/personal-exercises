public class Studenti {

    public String nome;

    public String cognome;

    public double mediaVoti;

    public Studenti(String nome, String cognome, double mediaVoti){
        this.nome = nome;
        this.cognome = cognome;
        this.mediaVoti = mediaVoti;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public double getMediaVoti() {
        return mediaVoti;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setMediaVoti(double mediaVoti) {
        this.mediaVoti = mediaVoti;
    }

    @Override
    public String toString() {
        return "Studenti{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", mediaVoti=" + mediaVoti +
                '}';
    }

    public void stampaDettaglio(){
        System.out.println("nome:" + "" + nome + "/" + "cognome:" + "" + cognome + "/" + "media Voti:" + "" + mediaVoti);
    }

}
