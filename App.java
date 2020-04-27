package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BankAccount personaccount = new BankAccount();

        personaccount.setaccountNumber(11111222);
        personaccount.setbalance(33000);
        personaccount.setcustomerName("Amer Rasheed");
        personaccount.setemail("amerrashe@gmail.com");
        personaccount.setphoneNumber(237476);


        System.out.println("Account Information is " + personaccount.getCustomerName());
        System.out.println("Account Balance is " + personaccount.getBalance());
        System.out.println("Customer Name is  " + personaccount.getCustomerName());
        System.out.println("Customer Email is " + personaccount.getEmail());
        System.out.println(" Customer Phone Number is " + personaccount.getPhoneNumber());


    }
}
