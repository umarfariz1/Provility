package Task.Bank;

public class Savings extends Account {
    double balance;
    double amount;
    double interestRate = 0.8;

    public Savings() {
    }//Default Constructor




    public Savings(double balance) {
        this.balance = balance;
    }

    @Override//Deposit method is overridden from Account class
    public void Deposit(double amount) {


        balance = balance + amount + (amount * interestRate);
    }

    @Override //Withdraw method is overridden from Account class
    public void Withdraw(double amount) {
        balance = balance - amount - (amount * interestRate);
    }

    @Override//printBalance method is overridden from Account class
    public void printBalance() {
        System.out.println("Balance in your Savings Account is :: " + balance);
    }
}
