import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {

    private List<T> pipelist;

    public Pipe() {
        this.pipelist = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.pipelist.add(value);

    }

    public T takeFromPipe() {

        if (this.pipelist.isEmpty()) {
            return null;
        }
        T value = this.pipelist.get(0);

        this.pipelist.remove(0);
        return value;

    }

    public boolean isInPipe() {

        if (this.pipelist.isEmpty()) {
            return false;
        } else {
            return true;
        }

    }

}