package lab10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
    ArrayList<Product> products = new ArrayList<>(); //private!!
    private long starTime; //nem kell adatagkent megadni oket
    private long endTime;


    public Storage(String File_Name){
        try(Scanner scanner = new Scanner(new File(File_Name))){
            while( scanner.hasNextLine() ){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0]);
                String name = items[1];
                int amount = Integer.parseInt(items[2]);
                int price = Integer.parseInt(items[3]);
                products.add(new Product(id,name,amount,price));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public long update(String File_Name){
        int num=0;
        starTime = System.currentTimeMillis();
        try(Scanner scanner = new Scanner(new File(File_Name))){
            while( scanner.hasNextLine() ){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0]);
                int newAmount = Integer.parseInt(items[1]);

                //Linearis kereses helyett jobb lett volna egy binaris.
                for(int i=0;i< products.size();i++){
                    if(products.get(i).getIdentifier()==id){
                        Product aux = new Product(id,products.get(i).getName(),newAmount,products.get(i).getPrice());
                        products.set(i,aux);
                        num++;
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        endTime=System.currentTimeMillis();
        System.out.println("Execution time:");
        System.out.print(endTime-starTime);
        System.out.println();
        System.out.println("Number of products updated: ");
        return num;
    }
}
