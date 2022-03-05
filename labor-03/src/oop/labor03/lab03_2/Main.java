package oop.labor03.lab03_2;

import oop.labor03.lab03_1.BankAccount;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "Black");
        Customer customer2 = new Customer("Mary", "White");

        customer1.addAccount(new BankAccount("OTP00001"));
        customer1.addAccount(new BankAccount("OTP00002"));
        customer1.addAccount(new BankAccount("OTP00003"));
        customer1.addAccount(new BankAccount("OTP00004"));
        customer1.addAccount(new BankAccount("OTP00005"));

        customer2.addAccount(new BankAccount("OTP00006"));
        customer2.addAccount(new BankAccount("OTP00007"));
        customer2.addAccount(new BankAccount("OTP00008"));
        customer2.addAccount(new BankAccount("OTP00009"));
        customer2.addAccount(new BankAccount("OTP00010"));
        customer2.addAccount(new BankAccount("OTP00011"));
        customer2.addAccount(new BankAccount("OTP00012"));
        customer2.addAccount(new BankAccount("OTP00013"));
        customer2.addAccount(new BankAccount("OTP00014"));

        System.out.println(customer1);
        System.out.println(customer2);

        customer1.getAccount("OTP00001").deposit(2105);
        customer1.getAccount("OTP00002").deposit(100);
        customer1.getAccount("OTP00003").deposit(2100);
        customer1.getAccount("OTP00004").deposit(200);
        customer1.getAccount("OTP00005").deposit(400);

        customer2.getAccount("OTP00006").deposit(1000);
        customer2.getAccount("OTP00007").deposit(1600);
        customer2.getAccount("OTP00008").deposit(500);
        customer2.getAccount("OTP00009").deposit(1000);
        customer2.getAccount("OTP00010").deposit(700);
        customer2.getAccount("OTP00011").deposit(100);
        customer2.getAccount("OTP00012").deposit(1020);
        customer2.getAccount("OTP00013").deposit(50);
        customer2.getAccount("OTP00014").deposit(1000);

        System.out.println(customer1);
        System.out.println(customer2);

        customer1.closeAccount("OTP00001");
        customer2.closeAccount("OTP00014");

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
