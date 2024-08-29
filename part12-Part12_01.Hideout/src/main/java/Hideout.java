import java.util.ArrayList;

public class Hideout<T> {
    private ArrayList<T> hideList;

    public Hideout() {
        this.hideList = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (this.hideList.contains(toHide)) {
            this.hideList.remove(toHide);
        } else {
            this.hideList.add(toHide);
        }
    }

    // return last inserted element
    public T takeFromHideout() {
        if (this.hideList.isEmpty()) {
            return null;
        } else {
            return this.hideList.get(this.hideList.size() - 1);
        }
    }

    public boolean isInHideout() {
        if (this.hideList.isEmpty())
            return false;
        return true;
    }
}
