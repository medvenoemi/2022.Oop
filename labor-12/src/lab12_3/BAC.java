package lab12_3;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.io.File;
import java.util.Scanner;

public class BAC {

    HashMap<Integer, Student> studentHashMap = new HashMap<>();

    enum SUBJECT{
        ROMANIAN("roman.txt"), HUNGARIAN("magyar.txt"), MATH("matek.txt");


        private final String name;
        SUBJECT(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }
    };

    public BAC() {
        readNames("nevek1.txt");
        for(SUBJECT subject: SUBJECT.values()){
            readSubjects(subject);
        }
        System.out.println(howManyPassed());
    }

    private void readNames(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");

                studentHashMap.put(Integer.parseInt(items[0]), new Student(Integer.parseInt(items[0].trim()), items[1].trim(), items[2].trim()));
            }

            System.out.println(studentHashMap.size());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void readSubjects(SUBJECT subject) {
        try (Scanner scanner = new Scanner(new File(subject.getName()))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");

                switch (subject) {
                    case MATH -> {
                        studentHashMap.get(Integer.parseInt(items[0].trim())).setMath(Double.parseDouble(items[1].trim()));
                    }
                    case ROMANIAN -> {
                        studentHashMap.get(Integer.parseInt(items[0].trim())).setRomanian(Double.parseDouble(items[1].trim()));
                    }
                    case HUNGARIAN -> {
                        studentHashMap.get(Integer.parseInt(items[0].trim())).setHungarian(Double.parseDouble(items[1].trim()));
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int howManyPassed() {
        int passed = 0;
        for(Student student: studentHashMap.values()) {
            if (student.getAverage() != 0) {
                passed++;
            }
        }

        return passed;
    }
}
