public class Account {
    private String name;
    private String Number;
    private double balance;

    public Account(String name, String Number, double balance) {
        this.name = name;
        this.Number = Number;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public String getNumber() {
        return Number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}