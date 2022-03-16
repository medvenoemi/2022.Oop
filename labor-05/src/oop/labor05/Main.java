package oop.labor05;

import oop.labor05.models.Course;
import oop.labor05.models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = readCourses("courses.csv");
        for(Course c:courses){
            System.out.println("Course name: " + c.getName());
            System.out.println("\t" + "Description: " + c.getDescription());
            System.out.println("\t" + "Course length: " + c.getNumHours());
        }

        ArrayList<Student> students = readStudents("students (1).csv");
        for(Student s:students){
            System.out.println("Student ID: " + s.getID());
            System.out.println("\t" + "Student first name: " + s.getFirstName());
            System.out.println("\t" + "Student last name: " + s.getLastName());
        }

    }
    private static ArrayList<Course> readCourses(String filename){
        ArrayList<Course> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                // trim: eliminates leading and trailing spaces
                String name = items[0].trim();
                String description = items[1].trim();
                // Convert String → int: Integer.parseInt( String)
                int numHours = Integer.parseInt(items[2].trim());
                courses.add(new Course(name, description, numHours));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }

    private static ArrayList<Student> readStudents(String filename){
        ArrayList<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                // trim: eliminates leading and trailing spaces
                String ID = items[0].trim();
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                students.add(new Student(ID, firstName, lastName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
