package Metier;

import javafx.concurrent.Task;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class GestionnaireTacheTest {

    @Test
    void creerTache() {
        User user1 = new User("ouail", "mail1");
        User user2 = new User("bayan", "mail2");

        Tache task1 = new Tache(user1, "tache test1", new Date());
        Tache task2 = new Tache(user1, "tache test2", new Date());

        GestionnaireTache manager = new GestionnaireTache();

        manager.creerTache(user1, task1);
        manager.creerTache(user1, task2);

        Tache task3 = new Tache(user1, "tache test2", new Date());

        assertTrue(manager.getTaskUser(user1).contains(task2));
    }

    @Test
    void annulerTache() {
        User user1 = new User("ouail", "mail1");
        User user2 = new User("bayan", "mail2");

        Tache task1 = new Tache(user1, "tache test1", new Date());
        Tache task2 = new Tache(user1, "tache test2", new Date());

        GestionnaireTache manager = new GestionnaireTache();

        manager.annulerTache(user1, task1);

        assertTrue();

    }
}