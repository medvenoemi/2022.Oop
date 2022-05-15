package lab12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Storage {

    private final  Map<Integer, Product> products = new HashMap<>();

    public Storage(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            String temp;
            String[] x;
            while (scanner.hasNextLine()) {
                temp = scanner.nextLine();
                x = temp.split(" ");
                products.put(Integer.parseInt(x[0].trim()),new Product(Integer.parseInt(x[0].trim()),x[1].trim(),Integer.parseInt(x[2].trim()),Integer.parseInt(x[3].trim())));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void update(String fileName){
        int counter = 0;
        try(Scanner scanner = new Scanner(new File("inputFiles/"+fileName))){
            String temp;
            String[] m;
            while(scanner.hasNextLine()){
                temp = scanner.nextLine();
                m = temp.split(" ");


                products.get(Integer.parseInt(m[0].trim())).updateAmount(Integer.parseInt(m[1].trim()));
            }

            System.out.println(counter+ " products successfully updated!");

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
