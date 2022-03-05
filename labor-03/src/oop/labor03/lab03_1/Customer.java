package oop.labor03.lab03_1;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }

    public void setAccount(BankAccount BankAcc){
        this.account = BankAcc;
    }

    public BankAccount getAccount(){
        return account;
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

    public void closeAccount(){
        this.firstName = null;
        this.lastName = null;
        this.account = null;
    }

    @Override
    public String toString(){
        return "Customer: " +"firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account='" + account + '\'';
    }
}
