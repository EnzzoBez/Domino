import java.util.ArrayList;
import java.util.Random;

public class Deck{
    private ArrayList<Piece> pieces;
    Random random = new Random();

    public Deck(){
        this.pieces = new ArrayList<>();
        this.populate();
    }

    public void populate(){
        for(int i = 0; i < 7; i++){
            for(int j = i; j < 7; j++){
                this.pieces.add(new Piece(i,j));
            }
        }
    }

    public Piece pickPiece(){
        return pieces.remove(random.nextInt());
    }
}