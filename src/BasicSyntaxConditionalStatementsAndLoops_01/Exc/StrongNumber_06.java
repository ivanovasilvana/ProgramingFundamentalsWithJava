package BasicSyntaxConditionalStatementsAndLoops_01.Exc;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int currentNum = input % 10;
        int num = input;
        int factorial = 1;
        while (num != 0) {
            for (int i = 1; i <= currentNum; i++) {
                factorial *= i;
            }
            sum += factorial;
            factorial = 1;
            num = num / 10;
            currentNum = num % 10;
        }
        if (input == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

