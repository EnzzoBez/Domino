import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();
        Table table = new Table();
        table.setDeck(deck);

        System.out.print("Número de jogadores: ");
        int np = input.nextInt();
        input.nextLine();

        for (int i = 0; i < np; i++) {
            System.out.print("Nome do jogador " + (i + 1) + ": ");
            String name = input.nextLine();
            Player player = new Player(name);
            table.addPlayer(player);
        }

        table.initialDraw();

        System.out.println("Mãos dos jogadores:");
        for (Player player : table.getPlayers()) {  // Correção aqui
            System.out.println(player);
        }

        int mostRelevantHand = table.mostRelevantHand();
        System.out.println("A mão mais relevante é: " + mostRelevantHand);
        System.out.println("Jogador atual: " + table.getCurrentPlayer().getName());
    }
}