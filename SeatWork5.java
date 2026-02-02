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
                                                                                                                                                                    System.out.println(GREEN + BOLD + 
                                                                                                                                                                                "Savings Interest added: $" + interest + RESET);
                                                                                                                                                                                    }
                                                                                                                                                                                    }

                                                                                                                                                                                    // ---------------- CHECKING ACCOUNT ----------------
                                                                                                                                                                                    class CheckingAccount extends BankAccount {
                                                                                                                                                                                        private double fee = 2.50;

                                                                                                                                                                                            public CheckingAccount(String accountNumber, double balance) {
                                                                                                                                                                                                    super(accountNumber, balance);
                                                                                                                                                                                                        }

                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                public void calculateInterest() {
                                                                                                                                                                                                                        balance -= fee;
                                                                                                                                                                                                                                System.out.println(RED + 
                                                                                                                                                                                                                                            "Checking accounts do not earn interest. Processing fee: $" + fee + RESET);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                // ---------------- MAIN CLASS ----------------
                                                                                                                                                                                                                                                public class Main {
                                                                                                                                                                                                                                                    public static void main(String[] args) {

                                                                                                                                                                                                                                                            BankAccount mySavings = new SavingsAccount("SAV-9910", 1000.00);
                                                                                                                                                                                                                                                                    BankAccount myChecking = new CheckingAccount("CHK-4452", 500.00);

                                                                                                                                                                                                                                                                            System.out.println("\n" + BankAccount.BOLD + 
                                                                                                                                                                                                                                                                                        "--- Banking System Dashboard ---" + BankAccount.RESET);

                                                                                                                                                                                                                                                                                                mySavings.displayAccountInfo();
                                                                                                                                                                                                                                                                                                        mySavings.calculateInterest();
                                                                                                                                                                                                                                                                                                                System.out.println("Updated Savings Balance: $" + mySavings.getBalance());

                                                                                                                                                                                                                                                                                                                        System.out.println("------------------------------------------------");

                                                                                                                                                                                                                                                                                                                                myChecking.displayAccountInfo();
                                                                                                                                                                                                                                                                                                                                        myChecking.calculateInterest();
                                                                                                                                                                                                                                                                                                                                                System.out.println("Updated Checking Balance: $" + myChecking.getBalance());

                                                                                                                                                                                                                                                                                                                                                        System.out.println(BankAccount.BOLD + "Transaction Completed" + BankAccount.RESET);
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            }
}
