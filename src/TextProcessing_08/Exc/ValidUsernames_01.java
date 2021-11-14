package TextProcessing_08.Exc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userNames = scanner.nextLine().split(", ");
        List<String> validUserNames = new ArrayList<>();
        boolean isValid = false;

        for (int i = 0; i < userNames.length; i++) {
            String currentUserName = userNames[i];
            if (currentUserName.length() >= 3 && currentUserName.length() <= 16) {
                for (int j = 0; j < currentUserName.length(); j++) {
                    char currentSymbol = currentUserName.charAt(j);
                    if (Character.isLetter(currentSymbol)
                            || Character.isDigit(currentSymbol)
                            || currentSymbol == '-'
                            || currentSymbol == '_') {
                        isValid = true;
                    } else {
                        isValid = false;
                        break;
                    }
                }
            } else {
                continue;
            }
            if (isValid) {
                validUserNames.add(currentUserName);
            }
        }
        for (String userName : validUserNames) {
            System.out.println(userName);
        }
    }
}
