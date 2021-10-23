package DataTypesAndVariables_02.Exc;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < count; i++) {
            char input = scanner.next().charAt(0);
            int num = input;
            sum += num;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}

