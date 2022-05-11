package lab12_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Student {

    private final int id;
    private final String firstName;
    private final String lastName;

    private final HashMap<String,Double> marks = new HashMap<>();
    private final HashSet<Tantargy> tantargyak = new HashSet<>();
    private double average;

    public Student(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void assignMark(String markType, Double markValue){

    }

    //average
    private String getMarkDetails() {
        StringBuilder result = new StringBuilder("");

        //v1
        for(String key : marks.keySet()){
            result.append(key).append(" : ").append(marks.get(key));
        }

        //v2
        for(Map.Entry<String, Double> entry : marks.entrySet()){
            result.append(entry.getKey()).append(":").append(entry.getValue());
        }

        //v3
        marks.forEach(
                (key, val)->result.append(key).append(":").append(val)
        );

        return result.toString();
    }

    //atlag lekeres

    //hashMap kiiratasa
    //Elso valtozat:
    // for (String i:marks.keyset()){
    //sout(i+":"+marks.get(i))}

    //Masodik valtozat:
    // for(Map.Entry<String, Double> entry : marks.entrySet()){
    //  System.out.println(entry.getKey() + ":" + entry.getValue());
    //}

    //Harmadik valtozat:
    //marks.forEach(
    //    (key, val) -> sout(key + ":" + val)
    //  )




    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", marks=" + getMarkDetails() +
                ", average=" + average +
                '}';
    }
}
