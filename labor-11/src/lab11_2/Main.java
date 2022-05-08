package lab11_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("warning.csv"))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] items = line.split(",");
                try {
                    String neptunCode = items[0].trim();
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    int credits = Integer.parseInt(items[3].trim());
                    int birthYear = Integer.parseInt(items[4].trim());
                    int birthMonth = Integer.parseInt(items[5].trim());
                    int birthDay = Integer.parseInt(items[6].trim());

                    students.add(new Student(neptunCode,firstName,lastName,credits,birthYear,birthMonth,birthDay));
                }
                catch(IndexOutOfBoundsException ex){
                    System.out.println("Input line: "+ line);
                    System.out.println(" Incomplete line " + line);
                }

                catch(NumberFormatException ex){
                    System.out.println("Number format exception"+ line);
                }

                catch(InvalidDateException ex){
                    System.out.println(ex);
                }

                catch(Exception e){
                    System.out.println("Invalid date");
                }

            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
