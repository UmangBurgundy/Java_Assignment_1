class ProductInventory {
    private final String productName;
    private int stockCount;
    private final Object lock = new Object();

    public ProductInventory(String productName, int stockCount) {
        this.productName = productName;
        this.stockCount = stockCount;
    }

    public void purchase(String customerName, int quantity) {
        System.out.println(customerName + " entered store to buy " + quantity + " units of " + productName);

        synchronized (lock) {
            System.out.println("[Lock Acquired] " + customerName + " checking stock: " + stockCount + " available.");
            if (stockCount >= quantity) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                stockCount -= quantity;
                System.out.println("[Order Confirmed] " + customerName + " purchased " + quantity + " units. Remaining: " + stockCount);
            } else {
                System.out.println("[Out of Stock] Sorry " + customerName + ", not enough stock for " + quantity + " units.");
            }
        }
    }

    public int getStockCount() {
        return stockCount;
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        ProductInventory inventory = new ProductInventory("Laptop", 10);

        Thread t1 = new Thread(() -> inventory.purchase("Customer-A", 4), "Thread-A");
        Thread t2 = new Thread(() -> inventory.purchase("Customer-B", 5), "Thread-B");
        Thread t3 = new Thread(() -> inventory.purchase("Customer-C", 3), "Thread-C");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final inventory stock: " + inventory.getStockCount());
    }
}
