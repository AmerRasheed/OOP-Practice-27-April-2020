package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static int deposit(double accnum, String custname, int custbalance){
        int depositam=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount to deposit " + depositam);
        depositam  = sc.nextInt();
        int newbalance= custbalance+ depositam;
        System.out.println("The amount of  " +depositam + " is deposited in the account of " + custname + " with account number "+ accnum );
        //System.out.println("The new balance is " + newbalance);
        return newbalance;
    }

    public static int withdraw(double accnum, String custname, int custbalance){
        int witham=0;
        int newbalance=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount to withdraw " + witham);
        witham =sc.nextInt();
        if(witham>custbalance)
            System.out.println("You cannot withdraw amount greater than the current balance");
        else
         newbalance= custbalance - witham;
        System.out.println("The amount of  " + witham + " is deposited in the account of " + custname + " with account number "+ accnum );
        //System.out.println("The new balance is " + newbalance);
        return newbalance;
    }
    public static void main( String[] args )
    {

        BankAccount personaccount = new BankAccount();

        personaccount.setaccountNumber(12233441);
        personaccount.setbalance(33000);
        personaccount.setcustomerName("Amer Rasheed");
        personaccount.setemail("amerrashe@gmail.com");
        personaccount.setphoneNumber(237476);


        System.out.println("Account Information is " + personaccount.getAccountNumber());
        System.out.println("Account Balance is " + personaccount.getBalance());
        System.out.println("Customer Name is  " + personaccount.getCustomerName());
        System.out.println("Customer Email is " + personaccount.getEmail());
        System.out.println(" Customer Phone Number is " + personaccount.getPhoneNumber());

int globalbalance = personaccount.getBalance();
        boolean running = true;
        Scanner sc= new Scanner(System.in);
        while(running) {
            System.out.println("Do you want to enter operation (Press y ) or you want to exit the program .....(Press n)  (y/n)");
            char c2 = sc.next().charAt(0);
                    if(c2=='y')
                    {
                         System.out.println("The current balance is "+ globalbalance);
                         int newbalance = deposit(personaccount.getAccountNumber(),personaccount.getCustomerName(),globalbalance);
                         globalbalance=newbalance;
                         System.out.println("The current balance is "+ globalbalance);
                         newbalance = withdraw(personaccount.getAccountNumber(),personaccount.getCustomerName(),globalbalance);
                         globalbalance=newbalance;
                         System.out.println("The current balance is "+ globalbalance);
                     }
            else running = false;
        }//While EXIT operation
        int newbalance = deposit(personaccount.getAccountNumber(),personaccount.getCustomerName(),personaccount.getBalance());
            }
}
