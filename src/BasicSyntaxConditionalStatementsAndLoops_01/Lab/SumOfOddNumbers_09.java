package BasicSyntaxConditionalStatementsAndLoops_01.Lab;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0 && n > 0) {
                System.out.printf("%d%n", i);
                sum += i;
                n--;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}