package oop.labor05.models;

import oop.labor02.date.MyDate;

import java.io.PrintStream;
import java.util.ArrayList;

public class Training {
    private final Course course;
    private final MyDate startDate;
    private final MyDate endDate;
    private final double pricePerStudent;
    private ArrayList<Student> enrolledStudent = new ArrayList<>();

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }


    public Course getCourse() {
        return course;
    }

    public void printToFile(){
        String fileName = String.format("%s_%s", name);
        try {
            PrintStream output = new PrintStream(fileName);

            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }


}
