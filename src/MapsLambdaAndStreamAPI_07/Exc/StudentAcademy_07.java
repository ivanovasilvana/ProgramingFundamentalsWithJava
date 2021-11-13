package MapsLambdaAndStreamAPI_07.Exc;

import java.util.*;

public class StudentAcademy_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentGrade = new HashMap<>();
        for (int i = 0; i < lines; i++) {
            String name = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());

            if (!studentGrade.containsKey(name)) {
                studentGrade.put(name, new ArrayList<>());
            }
            studentGrade.get(name).add(grade);
        }

        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentGrade.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);
            if (averageGrade >= 4.50) {
                studentAverageGrade.put(studentName, averageGrade);
            }
        }
        studentAverageGrade.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }

    public static double getAverageGrade(List<Double> grades) {
        double sumGrades = 0;
        for (double grade : grades) {
            sumGrades += grade;
        }
        return sumGrades / grades.size();
    }
}
