import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Piece> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void draw(Piece piece) {
        this.hand.add(piece);
    }

    public ArrayList<Piece> getHand() {
        return this.hand;
    }

    public int mostRelevantPiece() {
        int mostRelevant = -1;
        for (Piece piece : hand) {
            if (piece.isPair()) {
                if (mostRelevant == -1 || piece.numberPiece() > mostRelevant) {
                    mostRelevant = piece.numberPiece();
                }
            }
        }
        return mostRelevant;
    }

    @Override
    public String toString() {
        return name + "'s hand: " + hand;
    }
}