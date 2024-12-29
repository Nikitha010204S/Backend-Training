//Implement a simple banking system where users can open accounts, deposit money, withdraw money, and check balance
// using OOP.

package Day_2.Additional_Challenges;

import java.util.Scanner;

class Account{

    String Name;
    int Phone;
    int AccountNumber;
    String type;
    double Balance;

    Account(String Name,int Phone,int AccountNumber,String type,double Balance){
        this.Name=Name;
        this.Phone=Phone;
        this.AccountNumber=AccountNumber;
        this.type=type;
        this.Balance=2000;
    }
    public void Deposit(double deposit){
        if(deposit>0)
        {
        Balance+=deposit;
        System.out.println("Deposited : "+deposit);
    }
        else{
            System.out.println("Not enough money");
        }
}

    public void Withdraw(double withdraw){
        if(withdraw<Balance)
        {
            Balance-=withdraw;
            System.out.println("Withdrawn : "+withdraw);
        }
        else{
            System.out.println("Withdraw amount exceeds balance");
        }
    }

    public void Balance(){
        System.out.println("Your Balance is : "+Balance);
    }

}
public class Banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to online banking system");
        Account account = null;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Account Open");
            System.out.println("2. Account Deposit");
            System.out.println("3. Account Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.println("Enter your choice :");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if(account==null){
                        System.out.print("Enter your name: ");
                        String name = sc.nextLine();
                        sc.nextLine();
                        System.out.print("Enter your phone number: ");
                        int phone = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter account type (Savings/Current): ");
                        String type = sc.nextLine();

                        int accountNumber = (int) (Math.random() * 1000000);
                        account = new Account(name, phone, accountNumber, type, 0);
                        System.out.println("Account created successfully!");
                        System.out.println("Your Account Number is: " + accountNumber);
                    }
                    else {
                        System.out.println("You already have an account");
                    }
                    break;

                    case 2:
                        if(account!=null){
                            System.out.println("Enter amount to deposit :");
                            double deposit = sc.nextDouble();
                            account.Deposit(deposit);
                        }
                        else{
                            System.out.println("Please open account first");
                        }
                        break;

                        case 3:
                            if(account!=null){
                                System.out.println("Enter amount to withdraw :");
                                double withdraw = sc.nextDouble();
                                account.Withdraw(withdraw);
                            }
                            else{
                                System.out.println("Please open account first");
                            }
                            break;
                case 4:
                    if(account!=null){
                        account.Balance();
                    }

                    else{
                        System.out.println("Please open account first");
                }
                    break;

                case 5:
                    System.out.println("Thank you for choosing our online banking system");
                   return;

                default:
                    System.out.println("Invalid choice.Try again");



            }
        }
    }
}
