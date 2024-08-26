import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    // {unit, item list}
    HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<String>());

        // retrieve list and add item to that
        ArrayList<String> items = this.storage.get(unit);
        items.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storage.get(storageUnit) != null ? this.storage.get(storageUnit) : new ArrayList<String>();
    }

    public void remove(String storageUnit, String item) {
        // get list and then remove the item
        if (this.storage.containsKey(storageUnit)) {
            ArrayList<String> items = this.storage.get(storageUnit);
            items.remove(item); // removes only one
            if (items.isEmpty()) {
                this.storage.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsWithItems = new ArrayList<>();
        for (String key : this.storage.keySet()) {
            if (!this.storage.get(key).isEmpty()) {
                unitsWithItems.add(key);
            }
        }

        return unitsWithItems;
    }
}
