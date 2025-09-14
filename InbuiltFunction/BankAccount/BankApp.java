public class BankApp {
    public static void main(String[] args) {
        // Create bank accounts
        BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
        BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500.00);

        // Display account details
        System.out.println("\nAccount 1 Details:");
        account1.displayAccountDetails();

        System.out.println("\nAccount 2 Details:");
        account2.displayAccountDetails();

        // Show total accounts
        BankAccount.displayTotalAccounts();

        // Transactions
        System.out.println("\nPerforming transactions on Account 1:");
        account1.deposit(200);
        account1.withdraw(150);
        account1.displayAccountDetails();

        System.out.println("\nPerforming transactions on Account 2:");
        account2.deposit(100);
        account2.withdraw(800); // insufficient balance
        account2.displayAccountDetails();
    }
}
