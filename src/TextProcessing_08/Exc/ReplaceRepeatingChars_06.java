package TextProcessing_08.Exc;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);

        for (int i = 0; i < text.length(); i++) {
            if (i < text.length() - 1) {
                if (text.charAt(i) == text.charAt(i + 1)) {
                    text.deleteCharAt(i);
                    i--;
                }
            }
        }
        System.out.println(text);
    }
}
