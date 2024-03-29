import java.awt.*;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RegistroCreature registroCreature = new RegistroCreature();

        registroCreature.aggiungiCreatura(new CreaturaMagica ("Fata1","terra","comune","TimeStopper"));
        registroCreature.aggiungiCreatura(new CreaturaMagica ("Fata2","acqua","ultra","tornado"));




    }
}