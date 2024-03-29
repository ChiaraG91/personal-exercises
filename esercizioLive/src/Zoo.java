import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Zoo {

    private ArrayList<Animal> animalArrayList;
    private HashMap<Integer, Animal > animalHashmap;

    private HashSet<Animal> animalHashSet;
    public Zoo() {
        this.animalArrayList = new ArrayList<>();
        this.animalHashmap = new HashMap<>();
        this.animalHashSet = new HashSet<>();


    }

    public ArrayList<Animal> getAnimalArrayList() {
        return animalArrayList;
    }

    public void setAnimalArrayList(ArrayList<Animal> animalArrayList) {
        this.animalArrayList = animalArrayList;
    }

    public HashMap<Integer, Animal> getAnimalHashmap() {
        return animalHashmap;
    }

    public void setAnimalHashmap(HashMap<Integer, Animal> animalHashmap) {
        this.animalHashmap = animalHashmap;
    }

    public HashSet<Animal> getAnimalHashSet() {
        return animalHashSet;
    }

    public void setAnimalHashSet(HashSet<Animal> animalHashSet) {
        this.animalHashSet = animalHashSet;
    }

    //metodo per contenere una lista di animali all'interno del parco zoologico in ArrayList .
    public void addAnimalToList(Animal animal) throws Exception{
        // controllo per verificare che l'animale non sia già presente all'interno della lista
        if(!animalArrayList.contains(animal)){
            animalArrayList.add(animal);
            System.out.println("Animale aggiunto");
        } else{
            throw new Exception("Animale duplicato");
        }

    }

    //metodo per aggiungere animali alla mappa utilizzando un identificativo numerico come chiave.
    public void addAnimalToMap(Animal animal) throws Exception{
        //controllo che la mappa sia vuota e succesivo inserimento
        if(animalHashmap.isEmpty()){
            animalHashmap.put(animal.getId(), animal);
            System.out.println("Animale aggiunto");
        }else{
            //controllo che la mappa non contenga già l'id associato all'animale come key
            if(!animalHashmap.containsKey(animal.getId())){
                animalHashmap.put(animal.getId(), animal);
                System.out.println("Animale aggiunto");
            } else{
                throw new Exception("Animale duplicato");
            }
        }
    }

    //metodo che aggiunge diverse specie di animali all' HashSet
    public void addAnimalToSet(Animal animal) throws Exception {
        // se l'hashset èvuoto aggiunge il nuovo animale
        boolean isSpeciesPresent = false;
        if (animalHashSet.isEmpty()) {
            animalHashSet.add(animal);
            System.out.println("Animale aggiunto");
        } else {
            //verifica se una nuova specie esiste già all'interno dell'insieme prima di aggiungerla.
            for (Animal currentAnimal : animalHashSet) {
                if (animal.getSpecieEnum().equals(currentAnimal.getSpecieEnum())) {
                    isSpeciesPresent = true;
                    break;
                }
            }
        }
        if (!isSpeciesPresent) {
            animalHashSet.add(animal);
            System.out.println("Animale aggiunto");
        } else {
            throw new Exception("Animale duplicato");
        }

    }

    public void printDetailsList(){
        System.out.println("Lista degli animali nello zoo:");
        for (Animal animal : animalArrayList) {
            System.out.println("Nome: " + animal.getNome() + ", Specie: " + animal.getSpecieEnum());
        }
    }

    public void printDetailsMap(){
        System.out.println("Mappa degli animali nello zoo:");
        for (Map.Entry<Integer, Animal> entry : animalHashmap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Nome: " + entry.getValue().getNome() + ", Specie: " + entry.getValue().getSpecieEnum());
        }
    }

    public void printDetailsSet(){
        System.out.println("Set degli animali nello zoo:");
        for (Animal animal : animalHashSet) {
            System.out.println("Nome: " + animal.getNome() + ", Specie: " + animal.getSpecieEnum());
        }
    }




}
