package lab10_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<>();

        //Elso fele
        //products.add(new Product(1,"Sajt",10,12));
        //products.add(new Product(2,"Tej",5,11));
        //products.add(new Product(3,"Liszt",1,21));
        //System.out.println(products.toString());

        //Masodik fele

        Storage storage1 = new Storage("data1000.txt");
        System.out.println(storage1.update("update1000.txt"));
        System.out.println();


        Storage storage2 = new Storage("data1000.txt");
        System.out.println(storage2.update("update1000000.txt"));
        System.out.println();


        Storage storage3 = new Storage("data1000000.txt");
        System.out.println(storage3.update("update1000.txt"));
        System.out.println();


        Storage storage4 = new Storage("data1000000.txt");
        System.out.println(storage4.update("update1000000.txt"));
        System.out.println();




    }
}
