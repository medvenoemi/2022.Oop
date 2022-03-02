package oop.labor03.lab03_1;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber){
        accountNumber = accountNumber;
        balance = 0;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void deposit(double amount) {
        if(amount>0)
        {
            balance += amount;
        }

    }

    public boolean withdraw(double amount){
        if(amount <= balance){
            balance-=amount;
            return true;
        }
        return false;
    }

    @Override
        public String toString() {
            return "balance=" + balance +
                    ", accountNumber=" + accountNumber + '\'';
        }



}
