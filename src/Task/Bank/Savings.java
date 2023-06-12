package Task.Bank;

public class Savings extends Account {
    double balance;
    double amount;

    public Savings() {
    }//Default Constructor

    Account obj = new Account();
    double interestRate = obj.getInterestRate();//Private variable interest rate is called using getter method

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
