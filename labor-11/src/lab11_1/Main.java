package lab11_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Adj meg szamokat szokozzel elvalasztva: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] items = line.split(" ");
        double sum = 0;
        for(String item : items){
            try{
            sum+=Double.parseDouble(item);
            }
            catch (NumberFormatException ex){
                System.out.println("Hibas input: " + item + " nem egy szam");
            }
        }
        System.out.println("The sum is: "+ sum);
    }
}
