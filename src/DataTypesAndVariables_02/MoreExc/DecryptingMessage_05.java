package DataTypesAndVariables_02.MoreExc;

import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());
        String input = "";

        for (int i = 0; i < count; i++) {
            char letter = scanner.nextLine().charAt(0);
            char newLetter = (char) (letter + key);
            input += newLetter;
        }
        System.out.println(input);
    }
}

