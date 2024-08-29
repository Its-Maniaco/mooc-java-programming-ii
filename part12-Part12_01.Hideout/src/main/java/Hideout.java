
public class Hideout<T> {
    private T hidden;

    public void putIntoHideout(T toHide) {
        if (this.hidden != null) {
            if (this.hidden.equals(toHide)) {
                this.hidden = null;
            }
        }
        this.hidden = toHide;

    }

    // return last inserted element
    public T takeFromHideout() {
        if (this.hidden == null) {
            return null;
        } else {
            T res = this.hidden;
            this.hidden = null;
            return res;
        }
    }

    public boolean isInHideout() {
        if (this.hidden == null)
            return false;
        return true;
    }
}
