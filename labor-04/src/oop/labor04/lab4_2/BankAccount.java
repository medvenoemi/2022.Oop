package oop.labor04.lab4_2;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void deposit(double amount) {
        this.balance = amount+this.balance;

    }

    public boolean withdraw(double amount){
        if(balance-amount<0){
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "balance=" + balance +
                ", accountNumber=" + accountNumber + '\'';
    }


}
