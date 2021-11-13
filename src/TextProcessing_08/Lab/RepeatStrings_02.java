package TextProcessing_08.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArray = scanner.nextLine().split("\\s+");
        StringBuilder concat = new StringBuilder();

        for (int i = 0; i < textArray.length; i++) {
            String currentText = textArray[i];

            for (int j = 0; j < currentText.length(); j++) {
                concat.append(currentText);
            }
        }
        System.out.println(concat);

    }
}
