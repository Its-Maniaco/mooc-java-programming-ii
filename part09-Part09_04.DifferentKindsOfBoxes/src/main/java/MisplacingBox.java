import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> misplaceBox;

    public MisplacingBox() {
        this.misplaceBox = new ArrayList<>();
    }

    public void add(Item item) {
        misplaceBox.add(item);
    }

    public boolean isInBox(Item item) {
        return false;
    }
}
