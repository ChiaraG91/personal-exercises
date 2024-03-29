public class Manager extends Dipendente{

    private Integer livello;
    public Manager(String nome, Double salario,Integer livello) {
        super(nome, salario);
        this.livello = livello;
    }

    public Integer getLivello() {
        return livello;
    }

    public void setLivello(Integer livello) {
        this.livello = livello;
    }

    @Override
    public void calcolaSalarioAnnuo() {
        if(livello < 5){
            System.out.println(getSalario() * 12 + getSalario());
        } else if (livello > 5){
            System.out.println((getSalario() * 12) + (getSalario() * 2));
            }
        }

    @Override
    public void stampaInfoDipendente() {
        System.out.println("Manager: " + getNome() + " - " + getSalario() + " - " + livello);
    }
}
