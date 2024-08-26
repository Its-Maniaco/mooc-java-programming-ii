
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object object) {
        // compare references
        if (this == object)
            return true;

        // check type
        if (!(object instanceof Item)) {
            return false;
        }

        Item comparedObject = (Item) object;

        if (this.name.equals(comparedObject.name))
            return true;

        return false;
    }

    public int hashCode() {
        return this.getName().hashCode();
    }
}
