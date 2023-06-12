package Task.Bank;
public class Account {

    public void Withdraw(double amount) {    }
    public void Deposit(double amount) {    }
    public void printBalance() {    }

    public static void main(String[] args) {

        //Creating object for Savings class
        Account SAccount = new Savings(50000);

        //Input of 1000 is assigned to amount in deposit method
        SAccount.Deposit(1000);

        //printBalance method is called to print the balance in Saving account
        SAccount.printBalance();

        //Input of 3000 is assigned to amount in withdraw method
        SAccount.Withdraw(3000);

        //printBalance method is called to print the balance in Saving account
        SAccount.printBalance();
        System.out.println(" ");
        Account Caccount = new Current(50000);

        //Input of 1000 is assigned to amount in deposit method
        Caccount.Deposit(1000);

        //printBalance method is called to print the balance in Current account
        Caccount.printBalance();

        //Input of 1000 is assigned to amount in withdraw method
        Caccount.Withdraw(3000);

        //printBalance method is called to print the balance in Current account
        Caccount.printBalance();
    }
}