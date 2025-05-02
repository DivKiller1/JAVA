package CustomerPortal;
import ECommerce.Product;

public class CustomerCart {
    public static void main(String[] args) {
        Product p = new Product();
        p.getProductDetails();  // ✅ Works

        // p.applyDiscount();   ❌ Not allowed (protected)
        // p.updateStock();     ❌ Not allowed (default)
        // p.calculateProfit(); ❌ Not allowed (private)
    }
}
