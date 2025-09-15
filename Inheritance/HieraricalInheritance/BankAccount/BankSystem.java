package HieraricalInheritance.BankAccount;

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA456", 2000.0, 1000.0);
        FixedDepositAccount fd = new FixedDepositAccount("FD789", 10000.0, 24);

        System.out.println("---- Savings Account ----");
        savings.displayAccountType();
        savings.displayDetails();

        System.out.println("\n---- Checking Account ----");
        checking.displayAccountType();
        checking.displayDetails();

        System.out.println("\n---- Fixed Deposit Account ----");
        fd.displayAccountType();
        fd.displayDetails();
    }
}
