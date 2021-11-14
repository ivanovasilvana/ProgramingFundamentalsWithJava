package TextProcessing_08.Exc;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstText = scanner.next();
        String secondText = scanner.next();
        System.out.println(characterMultiplier(firstText, secondText));

    }

    public static Integer characterMultiplier(String firstText, String secondText) {
        int stop = Math.min(firstText.length(), secondText.length());
        int sum = 0;
        for (int i = 0; i < stop; i++) {
            sum += (firstText.charAt(i) * secondText.charAt(i));

        }

        if (firstText.length() > secondText.length()) {
            for (int i = stop; i < firstText.length(); i++) {
                sum += firstText.charAt(i);
            }
        } else if (secondText.length() > firstText.length()) {
            for (int i = stop; i < secondText.length(); i++) {
                sum += secondText.charAt(i);
            }
        }
        return sum;
    }
}
