package Encapsulation_Polymorphism_Interface_AbstractClass.BankingSystem;

// Interface for loan-related functionality
public interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

