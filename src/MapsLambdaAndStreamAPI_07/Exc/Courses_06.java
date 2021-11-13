package MapsLambdaAndStreamAPI_07.Exc;

import java.util.*;

public class Courses_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());

            }
            courses.get(courseName).add(studentName);
            input = scanner.nextLine();
        }

        courses.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))//сортиране по броя на хората
                .forEach(e -> {//за всеки един запис искам да ми отпечаташ:
                    System.out.println(e.getKey() + ": " + e.getValue().size());
                    e.getValue()
                            .stream()
                            .sorted(String::compareTo)//сортиране по азбучен ред
                            .forEach(student -> System.out.println("-- " + student));
                });
    }
}
