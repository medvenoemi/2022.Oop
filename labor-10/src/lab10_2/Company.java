package lab10_2;

import lab10_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee employee){
        if(!employees.contains(employee)){
            employees.add(employee);
        }
    }

    public void hireAll(String csvFile){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(csvFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: " + csvFile);
        }
        while (true) {
            assert scanner != null;
            if (!scanner.hasNextLine()) break;
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                continue;
            }
            String[] items = line.split(",");
            String firstName = items[0].trim();
            String lastName = items[1].trim();
            double salary = Double.parseDouble(items[2].trim());
            int year = Integer.parseInt(items[3].trim());
            int month = Integer.parseInt(items[4].trim());
            int day = Integer.parseInt(items[5].trim());

            if(items.length == 6) {
                this.employees.add(new Employee(firstName, lastName, salary, new MyDate(year, month, day)));
            }
            else {
                this.employees.add(new Manager(firstName, lastName, salary,new MyDate(year, month, day), items[6].trim()));
            }
        }
        scanner.close();

    }
    public void fire(int id){
        //Vigyazat, a contains EMployee-t keres. Nem adhatod csak az id-t. Hasonlokeppen a remove nem lesz jo id-val
        if(!employees.contains(id)){
            employees.remove(id);
        }
    }

    public void printAll(PrintStream ps){
        for(Employee e:employees){
            System.out.println(e);
        }
    }


    public void printManager(PrintStream ps){
        //getClass hasznalata
    }


    public void sortByComparator(Comparator<Employee> employeeComparator){
        employees.sort(employeeComparator);

    }
}
