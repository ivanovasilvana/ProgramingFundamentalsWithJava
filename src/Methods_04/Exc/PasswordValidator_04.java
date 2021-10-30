package Methods_04.Exc;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean isPasswordValidLength = isValidLength(password);
        boolean isValidPasswordContent = isValidContent(password);
        boolean isValidPasswordCountDigit = isValidCountDigit(password);

        if (!isPasswordValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValidPasswordContent) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isValidPasswordCountDigit) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isPasswordValidLength && isValidPasswordContent && isValidPasswordCountDigit) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidLength(String password) {
        if (password.length() < 6 || password.length() > 10) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isValidContent(String password) {

        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidCountDigit(String password) {
        int count = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
        }
        return count >= 2;
    }
}
