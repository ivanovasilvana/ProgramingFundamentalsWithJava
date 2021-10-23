package DataTypesAndVariables_02.MoreExc;

import javax.xml.stream.FactoryConfigurationError;
import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int openBrackets = 0;
        int closeBrackets = 0;
        int currentOpen = 0;
        int currentClose = 0;
        boolean isBalanced = false;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (input.contains("(")) {
                openBrackets++;
                if (openBrackets < closeBrackets) {
                    System.out.println("UNBALANCED");
                    return;
                }
            } else if (input.contains(")")) {
                closeBrackets++;
                if (openBrackets - closeBrackets != 0) {
                    System.out.println("UNBALANCED");
                    return;
                }
            }

        }
        if (openBrackets == closeBrackets) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}

