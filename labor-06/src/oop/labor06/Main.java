package oop.labor06;

import oop.labor06.lab6_1.BankAccount;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<BankAccount> accounts = new ArrayList<>();
        for(int i=0; i<150; i++){
            accounts.add(new BankAccount());
            System.out.println(accounts.get(i));
        }
    }
}
