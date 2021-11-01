package ObjectsAndClasses_06.Lab.ExcStudents_05;

public class Student {
    private String firstName;
    private String lastName;
    private String age;
    private String hometown;


    public Student(String firstName, String lastName, String age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getHometown(){
        return this.hometown;
    }
    @Override
    public String toString() {
        return String.format("%s %s is %s years old", firstName, lastName, age);
    }
}
