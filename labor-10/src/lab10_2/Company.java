package lab10_2;

import java.util.ArrayList;
import java.util.Comparator;

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

    public void sortByComparator(Comparator<Employee> employeeComparator){
        employees.sort(employeeComparator);

    }
}
