// Bank.java
public class Bank {
    public static void main(String[] args) {
        // Step 5: Create instances of SavingsAccount and CheckingAccount
        SavingsAccount savingsAccount = new SavingsAccount(101, "Alice", 2.5);
        CheckingAccount checkingAccount = new CheckingAccount(201, "Bob", 1000.0);

        // Step 6: Demonstrate method overriding
        System.out.println("Savings Account Information:");
        savingsAccount.getAccountInfo();

        System.out.println("\nChecking Account Information:");
        checkingAccount.getAccountInfo();

        // Steps 7: Perform deposit and withdrawal operations
        savingsAccount.deposit(1000.0);
        checkingAccount.deposit(500.0);

        savingsAccount.withdraw(200.0);
        checkingAccount.withdraw(1500.0);

        // Step 8: Compile and run the program
        System.out.println("\nUpdated Savings Account Information:");
        savingsAccount.getAccountInfo();

        System.out.println("\nUpdated Checking Account Information:");
        checkingAccount.getAccountInfo();
    }
}
