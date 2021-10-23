package DataTypesAndVariables_02.Lab;

import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isTrue = false;
        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            while (num != 0) {
                int lastDigit = num % 10;
                sum += lastDigit;
                num /= 10;
                if (sum == 5 || sum == 7 || sum == 11) {
                    isTrue = true;
                } else {
                    isTrue = false;
                }
            }
            if (isTrue) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}

