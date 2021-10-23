package BasicSyntaxConditionalStatementsAndLoops_01.Lab;

import java.util.Scanner;

public class EvenNumber_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        while (num % 2 != 0) {
            System.out.println("Please write an even number.");
            num = Integer.parseInt(scan.nextLine());
        }
        int output = Math.abs(num);
        System.out.printf("The number is: %d", output);
    }
}
