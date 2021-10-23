package BasicSyntaxConditionalStatementsAndLoops_01.Exc;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String input = scan.nextLine();
        String password = "";
        int count = 4;

        for (int i = username.length() - 1; i >= 0; i--) {
            password += (username.charAt(i));
        }
        while (!input.equals(password) || count == 0) {
            count--;
            if (count <= 0) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scan.nextLine();

        }
        if (password.equals(input)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}

