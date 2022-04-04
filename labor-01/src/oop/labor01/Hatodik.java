package oop.labor01;

public class Hatodik {
    public static int countBits(int number){
        int counter = 0;
        while(number!=0){
            if((number & 1) == 1){
                counter++;
            }
            number >>= 2;
        }
        return counter;
    }
    public static void main(String[] args){

        for(int i=0;i<31;i++){
            System.out.println(i + ": " + countBits(i));
        }

    }
}
