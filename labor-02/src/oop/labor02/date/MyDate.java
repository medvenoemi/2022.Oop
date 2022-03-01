package oop.labor02.date;

public class MyDate {

    private int year;
    private int month;
    private int day;
    public static Object toString;

    public MyDate(int nyear, int nmonth, int nday){
        year = nyear;
        month = nmonth;
        day = nday;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public static String toString(int year, int month, int day){
        String data = null;
        data = String.valueOf(year);
        data = data + " ";
        data = String.valueOf(month);
        data = data + " ";
        data = String.valueOf(day);
        return data;
    }
}
