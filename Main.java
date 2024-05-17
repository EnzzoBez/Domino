import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();
        Table table = new Table();
        table.setDeck(deck);

        System.out.print("Number of players: ");
        int np= input.nextInt();
        input.nextLine();

        for (int i = 0; i < np; i++){
            System.out.print("Player name" + (i+1) + ": ");
            String name = input.nextLine();
            Player player = new Player(name);
            table.addPlayer(player);
        }

        if(deck.getPieces().isEmpty()){
            
        } else{
            player.draw(deck.pickPiece());
        }
    }
}