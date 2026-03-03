abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    // ANSI color codes
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String RED = "\u001B[31m";
    public static final String BG_GRAY = "\u001B[47m\u001B[30m";

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Abstract method
    public abstract void calculateInterest();

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println(BG_GRAY + "ACCOUNT ID: " + accountNumber + RESET);
        System.out.println(BLUE + "Current Balance: $" + balance + RESET);
    }
}

// ---------------- SAVINGS ACCOUNT ----------------
class SavingsAccount extends BankAccount {
    private double interestRate = 0.05;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println(GREEN + BOLD + "Savings Interest added: $" + interest + RESET);
    }
}

// ---------------- CHECKING ACCOUNT ----------------
class CheckingAccount extends BankAccount {
    private double transactionFee = 2.0;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        // Checking accounts may not earn interest, just deduct fee
        balance -= transactionFee;
        System.out.println(RED + BOLD + "Transaction fee deducted: $" + transactionFee + RESET);
    }
}

// ---------------- DEMO CLASS ----------------
public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 1000);
        CheckingAccount ca = new CheckingAccount("CA456", 500);

        // Display initial balances
        sa.displayAccountInfo();
        ca.displayAccountInfo();

        // Apply interest/fees
        sa.calculateInterest();
        ca.calculateInterest();

        // Display updated balances
        sa.displayAccountInfo();
        ca.displayAccountInfo();
    }
}