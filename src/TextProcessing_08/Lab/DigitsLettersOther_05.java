package TextProcessing_08.Lab;

import java.util.Scanner;

public class DigitsLettersOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder digit = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder otherCharacters = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isDigit(currentChar)) {
                digit.append(currentChar);
            } else if (Character.isLetter(currentChar)) {
                letters.append(currentChar);
            } else {
                otherCharacters.append(currentChar);
            }
        }

        System.out.println(digit);
        System.out.println(letters);
        System.out.println(otherCharacters);

    }
}
