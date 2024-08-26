import java.util.ArrayList;

public class Box implements Packable {
    private double maxCapacity;
    private ArrayList<Packable> packableList;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.packableList = new ArrayList<>();
    }

    public void add(Packable pack) {
        if (this.weight() + pack.weight() <= maxCapacity) {
            this.packableList.add(pack);
        }
    }

    public double weight() {
        double weight = 0.0;
        for (Packable pack : this.packableList) {
            weight += pack.weight();
        }

        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.packableList.size() + " items, total weight " + this.weight() + " kg";
    }
}
