package Methods_04.Exc;

import java.util.Collections;
import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            System.out.println(isPalindrome(input));
            input = scanner.nextLine();
        }

    }

    public static boolean isPalindrome(String input) {
        String reversedInput = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput += input.charAt(i);
        }
        if (reversedInput.equals(input)) {
            return true;
        } else {
            return false;
        }
    }
}