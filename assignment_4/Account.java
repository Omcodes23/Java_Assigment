class Account {
    double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    double checkBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000);
        System.out.println("Balance: $" + account.checkBalance());

        account.withdrawal(500);
        System.out.println("Balance: $" + account.checkBalance());

        account.withdrawal(800);
        System.out.println("Balance: $" + account.checkBalance());
    }
}
