//Write a class BankAccount with private attributes for accountNumber and balance.
// Provide public methods to deposit, withdraw, and check the balance.
package Day_2.OOPsBasic;

public class Bankaccount_Encapsulation {
    private int account_number=12345;
    private int balance=100000;

    public void deposit(int amount)
    {
        balance = balance + amount;
        System.out.println("Deposited " + amount + " to the account number " + account_number);

    }
    public void withdraw(int amount)
    {
        balance = balance - amount;
        System.out.println("Withdrawn " + amount + " from the account number " + account_number);

    }
    public void balance()
    {
        
            System.out.println("Balance is " + balance);
    }
    public static void main(String[] args)
    {
        Bankaccount_Encapsulation obj = new Bankaccount_Encapsulation();
        obj.deposit(15000);
        obj.withdraw(20000);
        obj.balance();
    }
}
