import java.util.Comparator;

// use like Collections.sort(cards, new SortBySuit());
public class SortBySuit implements Comparator<Card> {
    public int compare(Card c1, Card c2) {
        return c1.getSuit().ordinal() - c2.getSuit().ordinal();
    }
}
