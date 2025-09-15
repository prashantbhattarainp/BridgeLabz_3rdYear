package Encapsulation_Polymorphism_Interface_AbstractClass.BankingSystem;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SAV-001", "Alice", 10000, 5.0);
        BankAccount acc2 = new CurrentAccount("CUR-002", "Bob", 5000, 2000);

        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount acc : accounts) {
            acc.displayAccountDetails();
            double interest = acc.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                double eligibility = loanAcc.calculateLoanEligibility();
                System.out.println("Loan Eligibility: " + eligibility);
                System.out.println("Loan Approved (5000)? " + loanAcc.applyForLoan(5000));
            }
            System.out.println("---------------------------");
        }
    }
}

