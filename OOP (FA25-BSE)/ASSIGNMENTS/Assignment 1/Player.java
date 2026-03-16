public class Player {

    private final String name;
    private int score;
    private Card card;

    Player(String name) {
        this.name = name;
        score = 0;
    }

    public void drawCard(Deck deck) {
        card = deck.drawCard();
    }

    public String getName() {
        return name;
    }

    public Card getCard() {
        return card;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }
}
