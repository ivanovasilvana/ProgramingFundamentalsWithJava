package BasicSyntaxConditionalStatementsAndLoops_01.Lab;

import java.util.Scanner;

public class StudentInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Integer age = Integer.parseInt(scanner.nextLine());
        Double grade = Double.parseDouble(scanner.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
    }
}