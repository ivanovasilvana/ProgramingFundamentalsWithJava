package Methods_04.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.###").format(calculate(first, operator, second)));
    }

    public static double calculate(int first, String operator, int second) {
        double result = 0.0;
        switch (operator) {
            case "/":
                result = first / second;
                break;
            case "*":
                result = first * second;
                break;
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
        }
        return result;
    }
}
