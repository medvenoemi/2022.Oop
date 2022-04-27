package lab10_1;

public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;
    public static Object toString;

    public MyDate(int nyear, int nmonth, int nday) {
        year = nyear;
        month = nmonth;
        day = nday;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return year + "." + month + "." + day;
    }


    @Override
    public int compareTo(MyDate that) {
        if(this.year == that.year){
            if(this.month == that.month){
                if(this.day == that.day){
                    return 0;
                }
                return this.day - that.day;
            }
            return this.month -that.month;
        }
        return this.year - that.year;

    }
}