package lab11_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(new File("students.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");

                System.out.println("Input line: " + line);
                // trim: eliminates leading and trailing spaces
                try{
                String NeptunId = items[0].trim();
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                int credits = Integer.parseInt(items[3].trim());
                int birthYear = Integer.parseInt(items[4].trim());
                int birthMonth = Integer.parseInt(items[5].trim());
                int birthDay = Integer.parseInt(items[6].trim());}
                catch (IndexOutOfBoundsException ex){

                    System.out.println("INCOMPLETE LINE: " + line);
                }

                catch (NumberFormatException ex){
                    System.out.println("NUMBER FORMAT EXCEPTION: " + line);
                }

                catch (InvalidDateException ex){

                }


                // Convert String → int: Integer.parseInt( String)

              //  persons.add(new Person(firstName, lastName, birtYear));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }
    }
}
