package Methods_04.Lab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(firstString, count));
    }

    public static String repeatString(String firstString, int count) {
        String finalString = "";
        for (int i = 0; i < count; i++) {
            finalString += firstString;
        }
        return finalString;
    }
}
