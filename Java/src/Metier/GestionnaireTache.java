package Metier;
import Metier.Tache;
import javafx.concurrent.Task;

import java.text.SimpleDateFormat;
import java.util.*;

public class GestionnaireTache {
    private Map<User, List<Tache>> liste = new HashMap<User, List<Tache>>();

    public GestionnaireTache(){

    }

    public void creerTache(User createur, Tache task){
//        SimpleDateFormat formater;
//        Date aujourdhui = new Date();
//        formater = new SimpleDateFormat("dd/MM/yy");
//        if (date.compareTo(aujourdhui) >= 0 ) {
//            Tache tache = new Tache(createur, description, date);
//            liste.add(tache);
//        }
//        else{
//            System.out.println("date erreur");
//        }

        if (!liste.containsKey(createur)){
            List<Tache> listeTache = new ArrayList<>();
            liste.put(createur, listeTache);
        }
        liste.get(createur).add(task);
    }

    public List<Tache> getTaskUser(User user){
        return liste.get(user);
    }

    public void annulerTache(User user, Tache task){

        if (liste.get(user).contains(task)){
            liste.get(user).get(liste.get(user).indexOf(task));
            task.setStatus(Status.CANCELED);
            task.setResolution(Resolution.IGNORED);
        } else {
            throw new IllegalArgumentException ("tache introuvable");
        }
    }

    public void replanifierTache(){

    }

    public Map<User, List<Tache>> afficherListe(){return liste;}
}
