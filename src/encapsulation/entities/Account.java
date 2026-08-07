package encapsulation.entities;

public class Account {

    private final int accNumber;
    private String accHolder;
    private double balance;

    public Account(int accNumber, String accHolder, double initialDeposit) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        deposit(initialDeposit);
    }

    // Overloaded constructor with default deposit
    public Account(int accNumber, String accHolder) {
        this(accNumber, accHolder, 0);
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        this.balance -= value + 5;
    }

    public String toString() {
        return "Account "
                + getAccNumber()
                + ", Holder: "
                + getAccHolder()
                + ", Balance: $"
                + String.format("%.2f", getBalance());
    }

}
