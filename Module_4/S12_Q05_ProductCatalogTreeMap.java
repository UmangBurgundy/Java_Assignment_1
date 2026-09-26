import java.util.Map;
import java.util.TreeMap;

public class S12_Q05_ProductCatalogTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> productCatalog = new TreeMap<>();

        productCatalog.put("Laptop", 1200.50);
        productCatalog.put("Headphones", 150.00);
        productCatalog.put("Keyboard", 85.99);
        productCatalog.put("Monitor", 300.00);
        productCatalog.put("Mouse", 25.50);

        System.out.println("Products sorted alphabetically by name:");
        for (Map.Entry<String, Double> entry : productCatalog.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " | Price: $" + entry.getValue());
        }
    }
}
