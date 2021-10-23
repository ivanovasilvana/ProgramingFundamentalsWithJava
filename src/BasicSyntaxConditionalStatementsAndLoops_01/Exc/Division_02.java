package BasicSyntaxConditionalStatementsAndLoops_01.Exc;

import java.util.Scanner;

public class Division_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int output = 0;
        if (num % 10 == 0) {
            output = 10;
            System.out.printf("The number is divisible by %d", output);
        } else if (num % 7 == 0) {
            output = 7;
            System.out.printf("The number is divisible by %d", output);
        } else if (num % 6 == 0) {
            output = 6;
            System.out.printf("The number is divisible by %d", output);
        } else if (num % 3 == 0) {
            output = 3;
            System.out.printf("The number is divisible by %d", output);
        } else if (num % 2 == 0) {
            output = 2;
            System.out.printf("The number is divisible by %d", output);
        } else {
            System.out.println("Not divisible");
        }
    }
}
