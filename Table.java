import java.util.ArrayList;

public class Table {
    private ArrayList<Player> players = new ArrayList<>();
    private Deck deck;
    private int currentPlayer;

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void initialDraw() {
        for (Player player : players) {
            for (int j = 0; j < 7; j++) {
                player.draw(this.deck.pickPiece());
            }
        }
    }

    public int mostRelevantHand() {
        int mostRelevant = -1;
        for (int i = 0; i < players.size(); i++) {
            int playerMostRelevantPiece = players.get(i).mostRelevantPiece();
            if (playerMostRelevantPiece > mostRelevant) {
                mostRelevant = playerMostRelevantPiece;
                currentPlayer = i;
            }
        }
        return mostRelevant;
    }

    public Player getCurrentPlayer() {
        return players.get(currentPlayer);
    }

    public ArrayList<Player> getPlayers() {  // Adição deste método
        return this.players;
    }
}