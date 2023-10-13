// SavingsAccount.java
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double interestRate) {
        super(accountNumber, accountHolder);
        this.interestRate = interestRate;
    }

    @Override
    public void getAccountInfo() {
        super.getAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
