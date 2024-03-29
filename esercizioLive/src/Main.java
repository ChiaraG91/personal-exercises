
public class Main {
    public static void main(String[] args) {
        gestioneZoo();
    }

    public static void gestioneZoo(){
        try{
            Animal animale1 = new Animal("cane",SpecieEnum.MAMMIFERI);
            Animal animale2 = new Animal("serpente",SpecieEnum.RETTILE);
            Animal animale3 = new Animal("coccodrillo", SpecieEnum.ANFIBIO);
            Zoo registroAnimali = new Zoo();
            registroAnimali.addAnimalToList(animale1);
            registroAnimali.addAnimalToList(animale2);
            registroAnimali.addAnimalToList(animale3);
            registroAnimali.printDetailsList();
            System.out.println(" ");
            registroAnimali.addAnimalToMap(animale1);
            registroAnimali.addAnimalToMap(animale2);
            registroAnimali.addAnimalToMap(animale3);
            registroAnimali.printDetailsMap();
            System.out.println(" ");
            registroAnimali.addAnimalToSet(animale1);
            registroAnimali.addAnimalToSet(animale2);
            registroAnimali.addAnimalToSet(animale3);
            registroAnimali.printDetailsSet();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
