package FinalExam.FinalExam_04;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command) {
                case "TakeOdd":
                    StringBuilder newPassword = new StringBuilder();
                    for (int i = 1; i < password.length(); i += 2) {

                        newPassword.append(password.charAt(i));
                    }
                    password = newPassword;
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);

                    password.delete(index, index + length);
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = tokens[1];
                    String substitute = tokens[2];
                    int start = password.indexOf(substring);
                    int end = start + substring.length();
                    if (start == -1) {
                        System.out.println("Nothing to replace!");
                    } else {
                        while (start > -1) {
                            password.replace(start, end, substitute);
                            start = password.indexOf(substring);
                            end = start + substring.length();
                        }
                        System.out.println(password);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }
}