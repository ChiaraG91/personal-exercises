public class CreaturaMagica {

    public String nome;

    public String tipo;

    public String livello;

    public String abilità;

    public CreaturaMagica (String nome, String tipo, String livello, String abilità) {
        this.nome = nome;
        this.tipo = tipo;
        this.livello = livello;
        this.abilità = abilità;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

    public String getAbilita() {
        return abilità;
    }

    public void setAbilita(String abilita) {
        this.abilità = abilità;
    }

    @Override
    public String toString() {
        return "CreaturaMagica{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", Livello='" + livello + '\'' +
                ", abilità='" + abilità + '\'' +
                '}';
    }




}
