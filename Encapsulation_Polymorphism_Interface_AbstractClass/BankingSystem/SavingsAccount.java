package Encapsulation_Polymorphism_Interface_AbstractClass.BankingSystem;

public class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // yearly percentage

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        setInterestRate(interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }

    private void setInterestRate(double interestRate) {
        if (interestRate <= 0) {
            throw new IllegalArgumentException("Interest rate must be positive.");
        }
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    @Override
    public boolean applyForLoan(double amount) {
        return amount <= calculateLoanEligibility();
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // Eligible up to 2x balance
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

