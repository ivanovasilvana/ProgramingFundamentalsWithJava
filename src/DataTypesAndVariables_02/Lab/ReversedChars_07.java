package DataTypesAndVariables_02.Lab;

import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char input = scanner.next().charAt(0);
            output.append(input);
            output.append(" ");
        }
        output.reverse();
        System.out.println(output);

    }
}
