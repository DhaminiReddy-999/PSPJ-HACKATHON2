class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(String accNum, String name, double initialBalance) {
        accountNumber = accNum;
        accountHolderName = name;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance to withdraw: $" + amount);
        }
    }

    public double checkBalance() {
        return balance;
    }
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }
}

public class Main {
    public static void performDeposit(BankAccount account, double amount) {
        account.deposit(amount);
    }
    public static void performWithdraw(BankAccount account, double amount) {
        account.withdraw(amount);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("26354", "Dhamini", 1000.0);
        
        System.out.println("--- Initial Details ---");
        account.displayAccount();
        System.out.println();

        performDeposit(account, 500.0);
        performWithdraw(account, 200.0);

        System.out.println("\n--- Final Details ---");
        account.displayAccount();
    }
}
