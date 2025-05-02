class Customer {
    private double balance;

    public Customer(double initialBalance) {
        this.balance = initialBalance;
    }

    public void addBalance(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void addBalance(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    protected void deductBalance(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Deducted: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Customer customer = new Customer(1000.0); 
        customer.addBalance(500);
        customer.addBalance(200.75);
        customer.showBalance();
        customer.deductBalance(300);
        customer.showBalance();
    }
}