import java.util.Objects;

public class Animal {

    private Integer id;

    private String nome;

    private SpecieEnum specieEnum;

    private static Integer counter = 1;
    public Animal(String nome, SpecieEnum specieEnum) {
        this.nome = nome;
        this.specieEnum = specieEnum;
        this.id = counter++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SpecieEnum getSpecieEnum() {
        return specieEnum;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nome, animal.nome) && specieEnum == animal.specieEnum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, specieEnum);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", specieEnum=" + specieEnum +
                '}';
    }
}
