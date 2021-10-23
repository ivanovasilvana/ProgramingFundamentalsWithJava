package DataTypesAndVariables_02.Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        int lastDigit = 0;
        boolean isTrue = false;
        for (int number = 1; number <= count; number++) {
            int sum = 0;
            lastDigit = number;
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            isTrue = (sum == 5) || (sum == 7) || (sum == 11);

            if (isTrue) {
                System.out.printf("%d -> True%n", lastDigit);
            } else {
                System.out.printf("%d -> False%n", lastDigit);
            }

            number = lastDigit;
        }

    }
}
