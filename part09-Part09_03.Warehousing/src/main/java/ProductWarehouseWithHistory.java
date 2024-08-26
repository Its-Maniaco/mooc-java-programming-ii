public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory historyObject;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.historyObject = new ChangeHistory();
        historyObject.add(initialBalance);
    }

    public String history() {
        return this.historyObject.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.historyObject.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double result = super.takeFromWarehouse(amount);
        this.historyObject.add(super.getBalance());
        return result;
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.historyObject.toString());
        System.out.println("Largest amount of product: " + this.historyObject.maxValue());
        System.out.println("Smallest amount of product:" + this.historyObject.minValue());
        System.out.println("Average: " + this.historyObject.average());
    }
}
