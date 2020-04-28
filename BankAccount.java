package org.example;


public class BankAccount {
    private double accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private double phoneNumber;

                                                                   //Since we have private fields.
                                                                   //There must be some mechanism to access these private class fields
                                                                   //Setters are ways of setting the private variables and then
                                                                   //fetching by getters (to outside world)
    public void setaccountNumber(double accountNumber)
    {
        this.accountNumber=accountNumber;                          // It cannot be a static method otherwise this will not be recognized.
        //this.accountNumber = accountNumber;
    }

    public void setbalance(int balance){
        this.balance=balance;
    }
    public void setcustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setemail(String email){
        this.email=email;
    }
    public void setphoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public double getAccountNumber(){                                   //Getter functions
        return accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public double getPhoneNumber(){
        return phoneNumber;
    }


}
