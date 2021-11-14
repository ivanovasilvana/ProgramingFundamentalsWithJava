package TextProcessing_08.Exc;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String decryptedText = scanner.nextLine();
        StringBuilder encrypted = new StringBuilder();

        for (char symbol : decryptedText.toCharArray()) {
            char newSymbol = (char) (symbol + 3);
            encrypted.append(newSymbol);
        }
        System.out.println(encrypted);
    }
}
