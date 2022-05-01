package lab10_2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Company company = new Company("Apple");
        /*company.hire(new Manager("Alpar", "Reszeg", 7000, new MyDate(2001, 8, 4), "Almaszedes"));
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
        company.printAll(System.out);*/


        company.hireAll("employees.csv");
        company.printAll(System.out);
        System.out.println();
        System.out.println("Alphabetically sorted:");
        System.out.println();

        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
               if( o1.getFirstName().equals(o2.getFirstName())){
                   return o1.getLastName().compareTo(o2.getLastName());
               }
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        company.printAll(System.out);
        System.out.println();
        System.out.println("Decreasing salary order: ");

        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary() == o2.getSalary()){
                    if(o2.getFirstName().equals(o2.getFirstName())){
                        return o1.getLastName().compareTo(o2.getLastName());
                    }
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
                return (int)(o2.getSalary() - o1.getSalary());
            }
        });

        company.printAll(System.out);
        System.out.println();
        System.out.println("Managers followed by employees:");

        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getClass() == Manager.class && o2.getClass()==Manager.class){
                    if( o1.getFirstName().equals(o2.getFirstName())){
                        return o1.getLastName().compareTo(o2.getLastName());
                    }
                }
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        company.printAll(System.out);
    }
}
