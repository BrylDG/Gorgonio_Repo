import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;

    // Default constructor 
    public BankAccount() {
        // Default constructor
    }

    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to display account balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount client = new BankAccount();
        int A = -1;
        double depAmount;

        System.out.println("Please enter your Account Number: ");
        client.setAccountNumber(scanner.nextInt());

        System.out.println("Please enter your Account Name: ");
        client.setAccountName(scanner.next());

        while (A != 0) {
            System.out.println("\n---\nSelection Menu:\n");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("0. Exit\n");
            System.out.print("Enter your choice: ");
            A = scanner.nextInt();

            switch (A) {
                case 1:
                    System.out.println("How much will you deposit: ");
                    depAmount = scanner.nextDouble();
                    client.deposit(depAmount);
                    break;
                case 2:
                    System.out.println("How much will you withdraw: ");
                    depAmount = scanner.nextDouble();
                    client.withdraw(depAmount);
                    break;
                case 3:
                    client.displayBalance();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}