import java.util.ArrayList;


//Client-klassen der opretter og bruger GameMenu.
 
public class Main4 {
    public static void main(String[] args) {
        // Opret listen med handlinger (fra Task 4)
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        // Lav menuen og vis den
        GameMenu menu = new GameMenu(actions);

        // 5.d - spørg brugeren og gem svaret
        String userChoice = menu.promptUser();

        // 5.g - konverter String -> int og kald doAction
        int choiceAsNumber = Integer.parseInt(userChoice.trim());
        doAction(choiceAsNumber);
    }

    // 5.e - metode der udfører brugerens valg
    public static void doAction(int action) {
        // 5.f - switch-case for de 4 muligheder
        switch (action) {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
            default:
                System.out.println("Unknown choice. Please run the program again and pick 1-4.");
        }
    }
}
