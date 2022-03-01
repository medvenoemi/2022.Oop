package oop.labor02.date;

import java.util.Random;

public class Main {
    public static void main (String[] args){
       /* System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);
        */

        int total = 0;
        Random rand = new Random();

        for(int i=0; i<1000; i++){
           int  year = 1 + rand.nextInt(500);
           int  month = 1 + rand.nextInt(24);
           int day = 1 + rand.nextInt(50);
            if(DateUtil.isValidDate(year, month, day)==true){
                System.out.println(MyDate.toString(year,month, day));
            }
            if(DateUtil.isValidDate(year, month, day)==false){
                total=total+1;
            }
        }
        System.out.println("The number of unreal dates: " + total);
    }
}
