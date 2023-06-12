package Task.Bank;

public class Current extends Account {

double amount;

    public Current(double balance)//constructor for Current class is created and parameters are assigned
    {
this.balance=balance;
    }

    @Override//Deposit method is overridden from Account class
    public void Deposit(double amount)
    {
balance =balance + amount;
    }

    @Override//Withdraw method is overridden from Account class
    public void Withdraw(double amount)
    {
balance = balance - amount;
    }
    @Override//printBalance method is overridden from Account class
    public void printBalance()
    {
        System.out.println("Balance in your Current Account is :: "+balance);
    }
}
