package lab10_2;

import lab10_1.MyDate;

public class Employee implements Comparable<Employee> {
    private final int ID;
    private String firstName;
    private String lastName;
    private double salary;
    private MyDate birthDate;
    private static int counter =1;

    public Employee(String firstName, String lastName, double salary, MyDate birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
        this.ID = counter++;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return ID == employee.ID && Double.compare(employee.salary, salary) == 0 && firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && birthDate.equals(employee.birthDate);
    }


    @Override
    public int compareTo(Employee o) {
        return (this.firstName+ " " + this.lastName).compareTo(o.firstName+ " "+o.lastName);
    }
}
