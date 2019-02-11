package com.uyghurschool.learnjava.classtutorial;

public class Bank {
    //bank name, account number, balance
    //fields
    private String bankName;
    private long accountNumber;
    private double accountBalance;
    //getter & setter

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return
                "bankName='" + bankName + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance ;
    }
}
