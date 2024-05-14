import java.util.ArrayList;
import java.util.Scanner;
public class Table{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();
        System.out.print("Number of players: ");
        int np= input.nextInt();
        input.nextLine();

        for (int i = 0; i < np; i++){
            Player player = new Player("asdf");
        }

        player.draw(deck.pickPiece());

    }
    private ArrayList<Player> players = new ArrayList<>();
}