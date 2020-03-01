package Metier;
import Metier.Tache;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GestionnaireTache {
    private ArrayList<Tache> liste = new ArrayList<Tache>();

    public GestionnaireTache(){

    }

    public void creerTache(String createur, String description, Date date){
//        SimpleDateFormat formater;
        Date aujourdhui = new Date();
//        formater = new SimpleDateFormat("dd/MM/yy");
        if (date.compareTo(aujourdhui) >= 0 ) {
            Tache tache = new Tache(createur, description, date);
            liste.add(tache);
        }
        else{
            System.out.println("date erreur");
        }
    }

    public void annulerTache(){

    }

    public void replanifierTache(){

    }

    public ArrayList<Tache> afficherListe(){return liste;}
}
