package lab12_3;

public class Student {

    private final int id;

    private double hungarian;
    private double romanian;
    private double math;

    private double average;

    private String firstName;
    private String lastName;

    public Student(int id, String firstName, String lastName) {
        final double hungarian = 0;
        final double romanian = 0;
        final double math = 0;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setHungarian(double hungarian) {
        this.hungarian = hungarian;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void setRomanian(double romanian) {
        this.romanian = romanian;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverage() {
        if (this.math >= 5 && this.hungarian >= 5 && this.romanian >= 5) {
            average = (this.math + this.romanian + this.hungarian) / 3;
            if (average >= 6) {
                return this.average;
            }
        }
        return 0;

    }
}
