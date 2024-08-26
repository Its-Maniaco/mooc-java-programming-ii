import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> oneItemBox;

    public OneItemBox() {
        this.oneItemBox = new ArrayList<>();
    }

    public void add(Item item) {
        if (this.oneItemBox.isEmpty()) {
            this.oneItemBox.add(item);
        }
    }

    public boolean isInBox(Item item) {
        return this.oneItemBox.contains(item);
    }

}
