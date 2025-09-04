public class BankAccount {
    public static void main(String[] args) {
        BankingAccount account1 = new BankingAccount(1001, "Alice", 5000);
        BankingAccount account2 = new BankingAccount(1002, "Bob", 10000);

        BankingAccount.withdraw(50000, account1);
        BankingAccount.display(account1);
        BankingAccount.deposit(600, account2);
        BankingAccount.display(account2);
    }
}
class BankingAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankingAccount(int accNum, String name, double bal) {
        this.accountNumber = accNum;
        this.accountHolderName = name;
        this.balance = bal;
    }

    public static void deposit(double amount, BankingAccount b) {
        b.balance += amount;
        System.out.println("Balance Updated!!");
    }

    public static void withdraw(double amount, BankingAccount b) {
        if (b.balance >= amount) {
            b.balance -= amount;
            System.out.println("Balance Updated!!");
        }

        else {
            System.out.println("Unsufficient Balance!!");
        }
    }
}



