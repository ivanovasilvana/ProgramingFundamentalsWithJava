package ObjectsAndClasses_06.Exc.OpinionPoll_03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> listOfPeople = new ArrayList<>();
        int row = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= row ; i++) {
            String personalInformation = scanner.nextLine();
            String name = personalInformation.split(" ")[0];
            int age = Integer.parseInt(personalInformation.split(" ")[1]);
            Person person = new Person (name, age);
            if (age > 30){
                listOfPeople.add(person);
            }
        }
        listOfPeople.sort(Comparator.comparing(Person::getName));

        for (Person person:listOfPeople) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
