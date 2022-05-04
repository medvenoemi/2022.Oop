package lab11_2;

public class Student {
    private final String neptunCode;
    private final String lastName;
    private final String firstName;
    private int credits;
   private final MyDate birthDate;

    public Student(String neptunCode, String lastName, String firstName, int credits, int year, int month, int day) throws Exception {
        if(!DateUtil.isValidDate(year, month, day)){
            throw new Exception("INVALID DATE");
        }
        this.birthDate = new MyDate(year, month, day);
        this.neptunCode = neptunCode;
        this.lastName = lastName;
        this.firstName = firstName;
        this.credits = credits;

    }
}
