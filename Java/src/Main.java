import Metier.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main (String[] args) {
        GestionnaireTache g = new GestionnaireTache();

        Date aujourdhui = new Date();
        
//        SimpleDateFormat formater;
//        formater = new SimpleDateFormat("dd/MM/yy");
//        String date = formater.format(aujourdhui);
//        System.out.println(date);

        g.creerTache("ouail", "testO", aujourdhui);
        g.creerTache("lux", "testL", aujourdhui);
        g.creerTache("momo", "testM", aujourdhui);
        g.creerTache("bayan", "testB", aujourdhui);


        System.out.println(g.afficherListe().get(0).getDescription());
        System.out.println(g.afficherListe().get(1).getDescription());
        System.out.println(g.afficherListe().get(2).getDescription());
        System.out.println(g.afficherListe().get(3).getDescription());
    }
}
