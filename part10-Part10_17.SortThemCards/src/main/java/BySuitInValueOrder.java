import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    public int compare(Card A, Card B) {
        int sortBySuit = A.getSuit().ordinal() - B.getSuit().ordinal();
        // if same suite
        if (sortBySuit == 0) {
            return A.getValue() - B.getValue();
        }

        return sortBySuit;
    }
}
