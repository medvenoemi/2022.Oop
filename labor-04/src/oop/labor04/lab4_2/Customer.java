package oop.labor04.lab4_2;

import java.util.ArrayList;

public class Customer {

    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();


    public Customer(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }

    public int getNumAccounts() {
        return accounts.size();
    }

    public void addAccount(BankAccount BankAcc){
        accounts.add(BankAcc);
    }


    public BankAccount getAccount(String accountNumber){
        
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
