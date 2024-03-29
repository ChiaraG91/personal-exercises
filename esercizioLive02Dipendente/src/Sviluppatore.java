public class Sviluppatore extends Dipendente{

    private Integer reparto;
    public Sviluppatore(String nome, Double salario, Integer reparto) {
        super(nome, salario);
        this.reparto = reparto;
    }

    public Integer getReparto() {
        return reparto;
    }

    public void setReparto(Integer reparto) {
        this.reparto = reparto;
    }

    @Override
    public void calcolaSalarioAnnuo() {
        if(reparto.equals(1)){
            System.out.println(getSalario() * 12 + getSalario());
        } else if (reparto.equals(2)){
            System.out.println((getSalario() * 12) + (getSalario() * 2));
        }
    }


    @Override
    public void stampaInfoDipendente() {
        System.out.println("Sviluppatore: " + getNome() + " - " + getSalario() + " - " + reparto);
    }
}
