import java.util.ArrayList;
import java.util.Scanner;


 //Entity-klassen som holder på menuens handlinger.

public class GameMenu {
    private ArrayList<String> actions;

    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    // Fra Task 4: viser menuen
    public void displayMenu() {
        System.out.println("Game Menu:");
        for (String action : actions) {
            System.out.println(action);
        }
    }

    // 5.a + 5.b + 5.c
    // Spørger brugeren om et valg og returnerer det som tekst (String)
    public String promptUser() {
        System.out.println("Type a number to choose an action");
        displayMenu(); // genbruger metoden fra Task 4

        Scanner scanner = new Scanner(System.in); // læser fra tastaturet
        String choice = scanner.nextLine();       // brugeren skriver fx "1"

        // Vi lukker ikke scanner her, så System.in stadig kan bruges senere i større programmer.
        return choice;
    }
}
