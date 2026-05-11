class ATM
{
    //variables
    String accountHolder;
    double balance;
    int pin;

    //methods

    void checkBalance()
    {
        System.out.println("The balance in your acc is: "+balance);
    }
    void deposit(double amount)
    {
        balance = balance + amount;

        System.out.println("Balance after deposit of "+ amount + " is " + balance);
    }
    void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;

            System.out.println("Balance after withdrawal of " + amount + " is " + balance);
        }
        else
        {
            System.out.println("Sorry bro, insufficient balance");
        }
    }
    void displayMiniStatement(){
        System.out.println("Account holder: "+accountHolder);
        System.out.println("You have "+balance+" left in your account");
    }
}

public class Bank{
    static void main(String[] args) {
        ATM user1 = new ATM();


        //Assigning the values
        user1.accountHolder = "Sethupathi";
        user1.balance = 1000;
        user1.pin = 572127;

        //Operations
        user1.checkBalance();
        user1.deposit(100);
        user1.withdraw(300);
        user1.checkBalance();
        user1.displayMiniStatement();
    }
}

