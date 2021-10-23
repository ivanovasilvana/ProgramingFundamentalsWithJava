package BasicSyntaxConditionalStatementsAndLoops_01.MoreExc;


import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < count; i++) {
            String input = scan.nextLine();

            int numberOfDigits = input.length();
            int mainDigit = Integer.parseInt(String.valueOf(input.toCharArray()[0]));
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset++;
            }
            if (mainDigit == 0) {
                output.append(" ");
                continue;
            }
            int index = (offset + numberOfDigits - 1);
            output.append((char) (97 + index));
        }
        System.out.println(output);
    }
}

