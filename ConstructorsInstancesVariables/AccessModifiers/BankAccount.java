class BankAccount {
    public int accountNumber;        // Public
    protected String accountHolder;  // Protected
    private double balance;          // Private

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods to access/modify private balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber + 
                           ", Holder: " + accountHolder + 
                           ", Balance: " + getBalance() + 
                           ", Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, "Bob", 5000.0, 4.5);
        sa.displayDetails();

        sa.deposit(2000);
        sa.withdraw(1500);
        sa.displayDetails();
    }
}
