public class Game {

    private Deck deck;
    private Player[] players;
    private int rounds;

    public Game(String[] names) {

        deck = new Deck();
        deck.shuffle();

        players = new Player[names.length];
        for (int i = 0; i < names.length; i++)
            players[i] = new Player(names[i]);

        rounds = 5;
    }

    // Start the game
    public void startGame() {

        for (int r = 1; r <= rounds; r++) {

            System.out.println("\n--- Round " + r + " ---");

            int highest = -1;
            int winnerIndex = -1;
            boolean tie=false;

            for (int i = 0; i < players.length; i++) {

                players[i].drawCard(deck);
                System.out.println(players[i].getName() + " drew " + players[i].getCard());

                int value = players[i].getCard().getValue();
                if (value > highest) {
                    highest = value;
                    winnerIndex = i;
                    tie=false;
                }
                else if(value == highest){
                    tie=true;
                }
            }

            if (tie) {
                System.out.println("Round is a tie. No points awarded.");
            } else {
                players[winnerIndex].incrementScore();
                System.out.println("Winner of round: " + players[winnerIndex].getName());
            }
        }

        showWinner();
    }

    private void showWinner() {

        System.out.println("\n--- Final Scores ---");
        int max = -1;
        Player winner = null;

        for (Player p : players) {
            System.out.println(p.getName() + " | Score: " + p.getScore());
            if (p.getScore() > max) {
                max = p.getScore();
                winner = p;
            }
        }

        System.out.println("\nGame Winner: " + winner.getName());
    }
}