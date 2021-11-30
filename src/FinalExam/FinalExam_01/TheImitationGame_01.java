package FinalExam.FinalExam_01;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();

        String input = scanner.nextLine();
        StringBuilder decryptedMessage = new StringBuilder(encryptedMessage);
        while (!input.equals("Decode")) {
            String command = input.split("\\|")[0];

            if (command.equals("Move")) {
                int numberOfLetters = Integer.parseInt(input.split("\\|")[1]);

                for (int i = 0; i < numberOfLetters; i++) {
                    char currentLetter = decryptedMessage.charAt(0);
                    decryptedMessage.deleteCharAt(0);
                    decryptedMessage.append(currentLetter);
                }
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(input.split("\\|")[1]);
                String symbol = input.split("\\|")[2];
                decryptedMessage.insert(index, symbol);
            } else if (command.equals("ChangeAll")) {
                String oldText = input.split("\\|")[1];
                String newText = input.split("\\|")[2];
                String decrypted = decryptedMessage.toString();
                decryptedMessage = new StringBuilder(decrypted.replace(oldText, newText));
            }


            input = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + decryptedMessage);
    }
}
