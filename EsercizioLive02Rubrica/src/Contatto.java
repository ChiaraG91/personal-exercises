public class Contatto {

    private String nome;
    private String cognome;
    private String numeroTelefonico;
    private String email;

    public Contatto(String nome, String cognome, String numeroTelefonico, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroTelefonico = numeroTelefonico;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contatto{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", numeroTelefonico='" + numeroTelefonico + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void infoContatto(){
        System.out.println("Contatto: " + nome + " - " + cognome + " - " + numeroTelefonico + " - " + email );
    }
}
