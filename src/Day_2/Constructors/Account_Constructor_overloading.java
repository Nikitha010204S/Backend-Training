//Write a program with a class Account that has overloaded constructors to initialize accountNumber and balance
// in different ways.

package Day_2.Constructors;

public class Account_Constructor_overloading {
    int accountNumber;
    int balance;

    Account_Constructor_overloading(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    Account_Constructor_overloading(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
    public static void main(String[] args) {
        Account_Constructor_overloading account = new Account_Constructor_overloading(12354);
        account.display();
        System.out.println();
        Account_Constructor_overloading account1= new Account_Constructor_overloading(85235,8000);
        account1.display();
    }



}
