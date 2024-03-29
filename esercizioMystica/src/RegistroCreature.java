import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RegistroCreature {

    private List<CreaturaMagica> listaCreature = new ArrayList();

    public RegistroCreature() {
    }

    public List<CreaturaMagica> getListaCreature() {
        return listaCreature;
    }

    public void setListaCreature(List<CreaturaMagica> listaCreature) {
        this.listaCreature = listaCreature;
    }

    public void elencoCreature(){
        for (CreaturaMagica creatura : listaCreature) {
            System.out.println(creatura.getNome());
        }
    }

    public void visualizzaInformazioniCreatura() {
        for (CreaturaMagica creatura : listaCreature) {
            System.out.println(creatura.toString());
        }
    }

    public List<CreaturaMagica> cercaCreaturaPerNome(String nome) {
        List<CreaturaMagica> nuovaLista = new ArrayList();
        Iterator var = this.listaCreature.iterator();

        while(var.hasNext()) {
            CreaturaMagica creaturaMagica = (CreaturaMagica) var.next();
            if (creaturaMagica.getNome() == nome) {
                nuovaLista.add(creaturaMagica);
            }
        }   return nuovaLista;
    }

    public List<CreaturaMagica> cercaCreaturaPerTipo(String tipo) {
        List<CreaturaMagica> nuovaLista = new ArrayList();
        Iterator var = this.listaCreature.iterator();

            while(var.hasNext()) {
            CreaturaMagica creaturaMagica = (CreaturaMagica) var.next();
            if (creaturaMagica.getTipo() == tipo) {
                nuovaLista.add(creaturaMagica);
            }
        }   return nuovaLista;
    }

    public List<CreaturaMagica> cercaCreaturaPerAbilità(String abilità) {
        List<CreaturaMagica> nuovaLista = new ArrayList();
        Iterator var = this.listaCreature.iterator();

        while(var.hasNext()) {
            CreaturaMagica creaturaMagica = (CreaturaMagica) var.next();
            if (creaturaMagica.getAbilita() == abilità) {
                nuovaLista.add(creaturaMagica);
            }
        }   return nuovaLista;
    }

    public void aggiungiCreatura(CreaturaMagica creaturaMagica) {
        List<CreaturaMagica> listaCreature = new ArrayList();
            listaCreature.add(creaturaMagica);
            System.out.println("La creatura è stata aggiunta");
    }

    public static void checkCreatura(CreaturaMagica creaturaMagica){
        if(creaturaMagica.tipo != creaturaMagica.getTipo()){
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException("Il tipo inserito non è valido");
            }
        } else if (creaturaMagica.livello != creaturaMagica.getLivello()){
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException("Errore: il numero non è compreso");
            }
        }
    }

    public void rimuoviCreatura(String creaturaMagica) {
        List<CreaturaMagica> listaCreature = new ArrayList();
        listaCreature.remove(creaturaMagica);
        System.out.println("La creatura è stata rimossa");

    }

    public void sfidaCreatura(String livello){
        List<CreaturaMagica> nuovaLista = new ArrayList();
        Iterator var = this.listaCreature.iterator();

        while(var.hasNext()) {
            CreaturaMagica creaturaMagica = (CreaturaMagica) var.next();
            if (creaturaMagica.getLivello() == livello) {
                nuovaLista.add(creaturaMagica);
            }
        } System.out.println("Inizia la sfida!");

    }

    public static void checkNull(String nome, String tipo, String livello, String abilità){
        try{
            if ( nome == null) {
                throw new NullPointerException("Errore");
            } else if ( tipo == null) {
                throw new NullPointerException("Errore");
            } else if (livello == null){
                throw new NullPointerException("Errore");
            } else if(abilità == null){
                throw new NullPointerException("Errore");
            }
        } catch (ArithmeticException e){
            System.out.println(e.getLocalizedMessage());
        }

    }
}