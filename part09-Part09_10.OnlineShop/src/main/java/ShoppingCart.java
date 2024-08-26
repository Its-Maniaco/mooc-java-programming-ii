import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> shoppingList;

    public ShoppingCart() {
        this.shoppingList = new ArrayList<>();
    }

    public void add(String product, int price) {

        for (int i = 0; i < this.shoppingList.size(); i++) {
            if (this.shoppingList.get(i).getProductName().equals(product)) {
                this.shoppingList.get(i).increaseQuantity();
                return;
            }
        }

        this.shoppingList.add(new Item(product, 1, price));

    }

    public int price() {
        int sum = 0;
        for (Item item : this.shoppingList) {
            sum += item.price();
        }
        return sum;
    }

    public void print() {
        for (Item item : this.shoppingList) {
            System.out.println(item.toString());
        }
    }
}
