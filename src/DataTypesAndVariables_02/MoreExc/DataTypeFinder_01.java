package DataTypesAndVariables_02.MoreExc;

import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String type = "";
        boolean isInteger = false;
        boolean isFloat = false;
        boolean isString = false;
        boolean isChar = false;
        int pointCounter = 0;

        while (!input.equals("END")) {
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                type = "boolean";
            } else if (input.length() == 1) {
                char symbol = input.charAt(0);
                if (symbol > 47 && symbol < 58) {
                    type = "integer";
                    isInteger = true;
                } else {
                    type = "character";
                }
            } else {
                for (int i = 0; i < input.length(); i++) {
                    char currentSymbol = input.charAt(i);
                    if (currentSymbol == 46 || currentSymbol == 44) {
                        type = "floating point";
                        isFloat = true;
                        ++pointCounter;
                        if (pointCounter > 1) {
                            type = "string";
                            break;
                        }
                    }
                    if (currentSymbol > 47 && currentSymbol < 58) {
                        isInteger = true;
                        type = "integer";
                    } else if (currentSymbol >= 0 && currentSymbol < 44 || currentSymbol == 47 || currentSymbol > 57 && currentSymbol < 128) {
                        type = "string";
                        isInteger = false;
                        isFloat = false;
                        break;
                    }
                    if (isFloat) {
                        isInteger = false;
                        type = "floating point";
                    }
                    if (isString) {
                        isFloat = false;
                        isInteger = false;
                        type = "string";
                    }

                }
            }
            System.out.printf("%s is %s type%n", input, type);
            isChar = false;
            isFloat = false;
            isInteger = false;
            isString = false;
            pointCounter = 0;
            input = scanner.nextLine();
        }
    }
}
