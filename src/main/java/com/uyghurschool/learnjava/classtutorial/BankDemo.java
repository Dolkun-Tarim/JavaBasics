package com.uyghurschool.learnjava.classtutorial;

public class BankDemo {

    private int accountNumber;
    private double balance;
    //constructor, getter, setter
    public BankDemo(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //deposit money
    public double depositMoney(double amount)
    {
        balance=balance+amount;
        return balance;
    }
    public double withdrawMoney(double amount)
    {
        if(amount<balance)
        {
            balance=balance-amount;
            System.out.println("Balance "+balance);
        }
        else
        {
            System.out.println("Your balance was "+balance);
            System.out.println("You cannot withdraw money more than your balance");
        }
        return balance;
    }

    public static void main(String[] args) {
        BankDemo myBank=new BankDemo(12345678,1000);
        System.out.println(myBank.depositMoney(500));
        System.out.println(myBank.depositMoney(1000));
        myBank.withdrawMoney(2000);
    }
}
