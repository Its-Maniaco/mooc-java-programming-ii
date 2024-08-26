import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herd = new ArrayList<>();

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable herdMember : this.herd) {
            herdMember.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (Movable herdMember : this.herd) {
            output += herdMember.toString() + "\n";
        }
        return output;
    }
}
