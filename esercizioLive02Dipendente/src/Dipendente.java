public class Dipendente {

    private String nome;
    private Double salario;

    public Dipendente(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void calcolaSalarioAnnuo(){
        System.out.println();
    }

    public void stampaInfoDipendente(){
        System.out.println();
    }
}
