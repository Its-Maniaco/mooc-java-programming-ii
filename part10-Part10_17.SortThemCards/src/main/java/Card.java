
public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if (value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }

        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    /*
     * Sorted by suite first.
     * 
     * @Override
     * public int compareTo(Card card) {
     * // cards of different suit
     * if (this.suit.ordinal() < card.suit.ordinal()) {
     * return -1;
     * } else if (this.suit.ordinal() > card.suit.ordinal()) {
     * return 1;
     * }
     * 
     * // if cards are of same suit
     * 
     * return this.getValue() - card.getValue();
     * 
     * }
     */

    @Override
    public int compareTo(Card card) {
        if (this.getValue() - card.getValue() == 0) {
            return this.getSuit().ordinal() - card.getSuit().ordinal();
        }

        return this.getValue() - card.getValue();

    }

}
