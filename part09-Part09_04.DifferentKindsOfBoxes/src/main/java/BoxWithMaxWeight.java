import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxCapacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxCapacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        if (!this.isInBox(item)) {
            if (currentWeight() + item.getWeight() <= this.maxCapacity)
                this.items.add(item);
        }
    }

    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

    private int currentWeight() {
        int weight = 0;
        for (int i = 0; i < items.size(); i++) {
            weight += items.get(i).getWeight();
        }
        return weight;
    }
}
