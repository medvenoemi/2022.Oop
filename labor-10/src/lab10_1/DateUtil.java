package lab10_1;

public class DateUtil {
    public static boolean leapYear(int year){
        return (year%4 == 0 && year % 100 != 0)|| (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day){

        if(day>31 || day<1){
            return false;
        }
        if(month>12 || month<0){
            return false;
        }
        //Augusztus es julius egymas utan 31 napos honapok a tobbi koveti a %2
        if(month%2 ==0 && (month!=2 || month!=8 || month!=7) && day>30){
            return false;
        }
        if((month == 8 || month==7) && day>31){
            return false;
        }
        if((leapYear(year)==true) && month==2 && day>=30){
            return false;
        }
        if((leapYear(year)==false) &&  month==2 && day>=29){
            return false;
        }
        if(year<0 || year==0){
            return false;
        }
        //minden adat helyes
        return true;
    }
}
