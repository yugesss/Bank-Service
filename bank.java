import java.util.ArrayList;

// Superclass
class Account {
    String accountHolder;
    double balance;

    // Constructor
    Account(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display details
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass
class SavingsAccount extends Account {

    double interestRate = 4.0;

    // Constructor
    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    // Method to calculate interest
    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

// Main class
public class BankingApp {
    public static void main(String[] args) {

        // ArrayList to store account holder names
        ArrayList<String> accountHolders = new ArrayList<>();

        // Creating objects
        SavingsAccount acc1 = new SavingsAccount("Yugesh", 5000);
        SavingsAccount acc2 = new SavingsAccount("Rahul", 3000);

        // Adding names to ArrayList
        accountHolders.add(acc1.accountHolder);
        accountHolders.add(acc2.accountHolder);

        // Performing operations
        acc1.deposit(1000);
        acc1.withdraw(2000);
        acc1.addInterest();
        acc1.display();

        System.out.println("--------------------");

        acc2.deposit(500);
        acc2.withdraw(1000);
        acc2.addInterest();
        acc2.display();

        System.out.println("\nAccount Holders List:");

        // String operations
        for (String name : accountHolders) {
            System.out.println("Name: " + name.toUpperCase()); // String operation
            System.out.println("Length: " + name.length());
        }
    }
}
