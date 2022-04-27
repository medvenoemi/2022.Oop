package lab10_2;

import lab10_1.MyDate;

import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Company company = new Company("Apple");
        company.hire(new Manager("Alpar", "Reszeg", 7000, new MyDate(2001, 8, 4), "Almaszedes"));
        company.hire(new Employee("Alfonz", "Biro", 4000, new MyDate(2000, 4, 8)));
        company.hire(new Employee("Etele", "Jakab", 4000, new MyDate(2000, 6, 22)));
        company.hire(new Employee("Anita", "Matyas", 4000, new MyDate(2001, 3, 8)));

        company.printAll(System.out);

        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getBirthDate().compareTo(o2.getBirthDate());
            }
        });


        System.out.println("\nRendezes utan");
        company.printAll(System.out);
    }
}
