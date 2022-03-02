package oop.labor03.lab03_2;

import oop.labor03.lab03_1.BankAccount;

public class Customer {
    public static final int MAX_ACCOUNTS = 10;
    private String firstName;
    private String lastName;
    private int numAccounts;
    private BankAccount accounts[] = new BankAccount[MAX_ACCOUNTS];

    public Customer(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }

    public void addAccount(BankAccount BankAcc){
        this.accounts[numAccounts] = BankAcc;
        numAccounts++;
    }

    public BankAccount getAccount(String accountNumber){
        return this.accounts;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lName){
        this.lastName = lName;
    }

    public void closeAccount(){
        this.firstName = null;
        this.lastName = null;
        this.account = null;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i].toString() + "\n");
        }
        return result.toString();
    }

}
