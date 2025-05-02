import java.util.*;

public class ProductInventory {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();

        // Add products
        inventory.put(1, 50);  // Product ID 1 → 50 units
        inventory.put(2, 30);  // Product ID 2 → 30 units
        inventory.put(3, 20);  // Product ID 3 → 20 units

        // Update quantity of product ID 2
        inventory.put(2, 40);

        // Remove product ID 3
        inventory.remove(3);

        // Display final inventory
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
