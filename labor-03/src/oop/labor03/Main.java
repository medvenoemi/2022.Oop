package oop.labor03;

import oop.labor03.enums.Degree;
import oop.labor03.enums.Department;
import oop.labor03.enums.Major;
import oop.labor03.models.Course;
import oop.labor03.models.Student;
import oop.labor03.models.Teacher;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {

        Course courses[] = new Course[10];

        Student student1 = new Student("AVLMO7", "Anna", "Bell", Major.INFORMATION_SCIENCE);
        /*Student student2 = new Student("BXNEVI", "John", "Black", Major.COMMUNICATION_AND_PUBLIC_RELATIONS);
        Student student3 = new Student("OPBGFX", "Emily", "White", Major.LANDSCAPE_ARCHITECTURE);*/

        Teacher teacher1 = new Teacher("Suzanne", "Grey", Degree.DOCENT, Department.MATHEMATICS_INFORMATICS);
        /*Teacher teacher2 = new Teacher("Michael", "Bell", Degree.ADJUNCT, Department.HORTICULTURE);
        Teacher teacher3 = new Teacher("Sara", "Peterson", Degree.PROFESSOR, Department.MECHANICAL_ENGINEERING);*/

        Course course1 = new Course("MB_INFO20", 5, DayOfWeek.FRIDAY);

       /* System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(teacher3);
        System.out.println(course1);*/

        course1.enrollStudents(student1);
        /*course1.enrollStudents(student2);
        course1.enrollStudents(student3);*/
        course1.enrollTeacher(teacher1);
        /*course1.enrollTeacher(teacher2);
        course1.enrollTeacher(teacher3);*/

        System.out.println(course1);
    }
}
