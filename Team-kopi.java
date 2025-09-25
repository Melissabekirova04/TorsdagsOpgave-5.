import java.util.ArrayList;

public class Team {
    // Felter
    private String teamName;
    private int rank;
    private ArrayList<String> players;

    // Konstruktør: kræver et holdnavn
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<String>();
    }

    // Sæt rang
    public void setRank(int rank) {
        this.rank = rank;
    }

    // Tilføj spiller
    public void addPlayer(String name) {
        players.add(name);
    }

    // Tekstrepræsentation (begynder-venlig version)
    @Override
    public String toString() {
        String text = "Hold: " + teamName + " Rang: " + rank;
        if (!players.isEmpty()) {
            text += "\nSpillere:";
            for (String p : players) {
                text += "\n - " + p;
            }
        }
        return text;
    }
}


