// TaxCalculator.java
class TaxCalculator {
    final double GST_RATE = 18.0;

    final void displayGST() {
        System.out.println("GST Rate: " + GST_RATE + "%");
    }
}

// Invoice.java
class Invoice extends TaxCalculator {
    double calculateTotalWithTax(double amount) {
        return amount + (amount * GST_RATE / 100);
    }

    // Uncommenting the below will cause compilation errors
    // void displayGST() {
    //     System.out.println("Trying to override GST method");
    // }

    // GST_RATE = 20.0; // Error: cannot assign a value to final variable
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Invoice inv = new Invoice();
        inv.displayGST();
        double total = inv.calculateTotalWithTax(1000); // input
        System.out.println("Total with GST: " + total);
    }
}
