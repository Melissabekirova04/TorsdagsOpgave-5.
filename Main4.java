import java.util.ArrayList;


 //Client-klassen der opretter og bruger GameMenu.
 
public class Main4 {
    public static void main(String[] args) {
        // 4.f - opret en liste med handlinger
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        // Tip til test (frivilligt):
        // Nedenstående linje printer element nr. 3 (indeks 2).
        // Her vil output være "3) Pause game".
        // System.out.println(actions.get(2));

        // 4.g - instantiér GameMenu med listen
        GameMenu menu = new GameMenu(actions);

        // 4.i - test displayMenu()
        menu.displayMenu();
    }
}
