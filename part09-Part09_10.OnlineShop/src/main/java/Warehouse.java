import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class Warehouse {
    // {product, price/stock}
    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;

    public Warehouse() {
        this.priceMap = new HashMap<>();
        this.stockMap = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.priceMap.put(product, price);
        this.stockMap.put(product, stock);
    }

    public int price(String product) {
        if (this.priceMap.containsKey(product)) {
            return this.priceMap.get(product);
        }

        return -99;
    }

    public int stock(String product) {
        if (this.stockMap.containsKey(product)) {
            return this.stockMap.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (stockMap.containsKey(product)) {
            if (stockMap.get(product) > 0) {
                stockMap.put(product, stockMap.get(product) - 1);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        return new HashSet<>(this.priceMap.keySet());
    }
}
