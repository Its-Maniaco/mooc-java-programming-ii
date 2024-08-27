import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cardsInHand;

    public Hand() {
        this.cardsInHand = new ArrayList<>();
    }

    public void add(Card card) {
        this.cardsInHand.add(card);
    }

    public void sort() {
        this.cardsInHand = this.cardsInHand.stream()
                .sorted() // auto resolves to card's toCompare
                .collect(Collectors.toCollection(ArrayList::new));

        // Collections.sort(this.cardsInHand);
        // use this because that is why toCompare was written.

    }

    public void sortBySuit() {
        Collections.sort(this.cardsInHand, new BySuitInValueOrder());
    }

    public void print() {
        // System.out.println(cardsInHand);
        this.cardsInHand.forEach(card -> System.out.println(card));
    }

    private int getHandValue() {
        return this.cardsInHand.stream()
                .map(card -> card.getValue()) // get the value of each card
                .reduce(0, (a, b) -> a + b); // sum the values of cards
    }

    public int compareTo(Hand hand) {
        return this.getHandValue() - hand.getHandValue();
    }
}
