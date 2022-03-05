package oop.labor03.lab03_2;

import oop.labor03.lab03_1.BankAccount;

public class Customer {
    public static final int MAX_ACCOUNTS = 10;
    private String firstName;
    private String lastName;
    private int numAccounts =0;
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
        for(int i=0;i<getNumAccounts();i++){
            if((this.accounts[i].getAccountNumber()).equals(accountNumber)){
                return this.accounts[i];
            }
        }
        return null;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lName){
        this.lastName = lName;
    }

    public void closeAccount(String accountNumber){
        for(int i=0; i<getNumAccounts(); i++){
            if((this.accounts[i].getAccountNumber()).equals(accountNumber)){
                for(int j=i; j<getNumAccounts();j++){
                    this.accounts[j]=this.accounts[j+1];
                }
            }
            numAccounts=numAccounts-1;
            break;
        }

    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i].toString() +"\n");
        }
        return result.toString();
    }
    }


