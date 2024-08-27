
public class Main {

    public static void main(String[] args) {
        // test your code here

        Card first = new Card(2, Suit.DIAMOND);
        Card second = new Card(14, Suit.SPADE);
        Card third = new Card(12, Suit.HEART);
        Card fouCard = new Card(12, Suit.DIAMOND);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        System.out.println(first.compareTo(second));
        System.out.println(first.compareTo(third));
        System.out.println(first.compareTo(fouCard));
    }
}
