package ECommerce;

public class Product {
    public void getProductDetails() {
        System.out.println("Product: Laptop, Price: ₹50,000");
    }

    protected void applyDiscount() {
        System.out.println("Discount of 10% applied.");
    }

    void updateStock() {
        System.out.println("Stock updated internally.");
    }

    private void calculateProfit() {
        System.out.println("Profit calculated.");
    }
}
