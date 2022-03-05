package oop.labor03.lab03_1;

public class Main {
    public static void main(String[] args) {
        ////Declaration of the customers
        Customer customer1 = new Customer("John", "Black");
        Customer customer2 = new Customer("Mary", "White");

        ////Basic State of the customers account
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());

        ////craeting new account
        customer1.setAccount(new BankAccount("OTP00001"));
        customer2.setAccount(new BankAccount("OTP00002"));


        //writing this
        System.out.println(customer1.toString());
        //System.out.println(customer1);
        System.out.println(customer2.toString());
        //System.out.println(customer2);

        //Adding a sum of money to account
        customer1.getAccount().deposit(1000);
        customer1.getAccount().deposit(1500);
        customer2.getAccount().deposit(500);


        //Final print
        System.out.println(customer1);
        System.out.println(customer2);

        //closing account
        customer2.closeAccount();

        customer2.setAccount(customer2.getAccount());
        System.out.println("Jhons and Marys account " + customer1);

        customer2.setLastName(customer1.getLastName());
        System.out.println(customer2);


    }
}
