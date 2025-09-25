import java.util.ArrayList;


 //Entity-klassen som holder på menuens handlinger.
 
public class GameMenu {
    // 4.b - privat instansvariabel
    private ArrayList<String> actions;

    // 4.c + 4.d - konstruktør der tager en liste og gemmer den
    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    // 4.h - viser menuen (for-each loop)
    public void displayMenu() {
        System.out.println("Game Menu:");
        for (String action : actions) {
            System.out.println(action);
        }
    }
}
