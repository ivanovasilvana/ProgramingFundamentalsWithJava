package Methods_04.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultipleOfEvensAndOdds(num));

    }

    public static int getMultipleOfEvensAndOdds(int num) {
        int evenSum = getEvenSum(num);
        int oddSum = getOddSum(num);
        return evenSum * oddSum;
    }

    public static int getEvenSum(int num) {
        int evenSum = 0;
        while (num > 0) {
            int currentNum = num % 10;
            if (currentNum % 2 == 0) {
                evenSum += currentNum;
            }
            num /= 10;
        }
        return evenSum;
    }

    public static int getOddSum(int num) {
        int oddSum = 0;
        while (num > 0) {
            int currentNum = num % 10;
            if (currentNum % 2 != 0) {
                oddSum += currentNum;
            }
            num /= 10;
        }
        return oddSum;
    }
}
