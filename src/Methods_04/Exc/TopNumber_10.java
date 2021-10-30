package Methods_04.Exc;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            boolean isTopNumber = (isDivisible(i) && isOddDigit(i));
            if (isTopNumber) {
                System.out.println(i);
            }
        }
    }

    public static boolean isDivisible(int i) {
        int sum = 0;
        while (i > 0) {
            int currentDigit = i % 10;
            sum += currentDigit;
            i /= 10;
        }
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOddDigit(int i) {
        boolean isOddDigit = false;
        while (i > 0) {
            int currentDigit = i % 10;
            if (currentDigit % 2 != 0) {
                isOddDigit = true;
                break;
            }
            i /= 10;
        }
        return isOddDigit;
    }
}
