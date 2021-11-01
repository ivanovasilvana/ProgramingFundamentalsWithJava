package ObjectsAndClasses_06.Exc.OrderByAge_07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String personalInfo = scanner.nextLine();
        List<Person> listOfPeople = new ArrayList<>();

        while (!personalInfo.equals("End")){
            String name = personalInfo.split(" ")[0];
            String id = personalInfo.split(" ")[1];
            int age = Integer.parseInt(personalInfo.split(" ")[2]);
            Person person = new Person(name, id, age);
            listOfPeople.add(person);
            personalInfo = scanner.nextLine();
        }
        listOfPeople.sort(Comparator.comparing(Person::getAge));

        for (Person person : listOfPeople) {
            System.out.println(person);
        }
    }
}
