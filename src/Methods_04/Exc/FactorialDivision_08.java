package Methods_04.Exc;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", factorialDivision(first, second));
    }

    public static double firstFactorial(int first) {
        double firstFactorial = 1;
        for (int i = 1; i <= first; i++) {
            firstFactorial *= i;
        }
        return firstFactorial;
    }

    public static double secondFactorial(int second) {
        double secondFactorial = 1;
        for (int i = 1; i <= second; i++) {
            secondFactorial *= i;
        }
        return secondFactorial;
    }

    public static double factorialDivision(int first, int second) {

        return firstFactorial(first) / secondFactorial(second);
    }
}
