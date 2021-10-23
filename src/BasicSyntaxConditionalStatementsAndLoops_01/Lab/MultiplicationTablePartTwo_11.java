package BasicSyntaxConditionalStatementsAndLoops_01.Lab;

import java.util.Scanner;

public class MultiplicationTablePartTwo_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int start = Integer.parseInt(scan.nextLine());
        int output = 0;
        if (start > 10) {
            output = num * start;
            System.out.printf("%d X %d = %d%n", num, start, output);
        } else {
            for (int i = start; i <= 10; i++) {
                output = num * i;
                System.out.printf("%d X %d = %d%n", num, i, output);
            }
        }
    }
}
