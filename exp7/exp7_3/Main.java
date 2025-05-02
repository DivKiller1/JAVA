
interface Wallet {
    void addFunds(double amount);
    void spendFunds(double amount);
}

class DigitalWallet implements Wallet {
    private double balance; 

    public DigitalWallet() {
        this.balance = 0.0;
    }

    @Override
    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Cannot add funds.");
        }
    }

    @Override
    public void spendFunds(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Spent: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        DigitalWallet myWallet = new DigitalWallet();

        myWallet.addFunds(100);
        myWallet.spendFunds(30);
        myWallet.spendFunds(80); 
        myWallet.addFunds(50);
        myWallet.spendFunds(40);
        
        System.out.println("Final Balance: $" + myWallet.getBalance());
    }
}
