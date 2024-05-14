import java.util.ArrayList;
public class Player{
    private String name;
    private ArrayList<Piece> hand = new ArrayList<>();

    public Player(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void initialDraw(Piece piece){
        for (int i = 0; i < 7; i++) {
            this.draw(piece);
        }
    }

    public void draw(Piece piece){
        this.hand.add(piece);
    }

}