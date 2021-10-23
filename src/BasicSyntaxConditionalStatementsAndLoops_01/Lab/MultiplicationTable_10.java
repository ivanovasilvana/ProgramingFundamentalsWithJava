package BasicSyntaxConditionalStatementsAndLoops_01.Lab;

import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= 10; i++) {
            int output = num * i;
            System.out.printf("%d X %d = %d%n", num, i, output);
        }
    }
}
