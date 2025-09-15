package HieraricalInheritance.BankAccount;

class FixedDepositAccount extends BankAccount {
    int depositTerm; // in months

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Deposit Term: " + depositTerm + " months");
    }

    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }
}
