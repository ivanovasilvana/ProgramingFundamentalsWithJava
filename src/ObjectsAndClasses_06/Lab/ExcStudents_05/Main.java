package ObjectsAndClasses_06.Lab.ExcStudents_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();

        while(!input.equals("end")){
            String firstName = input.split("\\s+")[0];
            String lastName = input.split("\\s+")[1];
            String age = input.split("\\s+")[2];
            String hometown = input.split("\\s+")[3];

            Student student = new Student(firstName, lastName, age, hometown);
            studentList.add(student);
        input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (Student student : studentList) {
            if (city.equals(student.getHometown())){
                System.out.println(student);
            }
        }
    }
}
