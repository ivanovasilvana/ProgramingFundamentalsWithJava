package FinalExam.FinalExam;

import java.util.Locale;
import java.util.Scanner;

public class StringManipulator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = (scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Translate":
                    String symbol = tokens[1];
                    String replacement = tokens[2];
                    text = text.replaceAll(symbol, replacement);
                    System.out.println(text);
                    break;
                case "Includes":
                    String substring = tokens[1];
                    if (text.contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String givenSubstring = tokens[1];
                    String currentSubstring = text.substring(0, givenSubstring.length());

                    if (givenSubstring.equals(currentSubstring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    text = text.toLowerCase();
                    System.out.println(text);
                    break;
                case "FindIndex":
                    String currentSymbol = tokens[1];
                    int index = text.lastIndexOf(currentSymbol);

                    System.out.println(index);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int count = Integer.parseInt(tokens[2]);
                    String oldString = text.substring(startIndex, startIndex + count);
                    text = text.replace(oldString, "");
                    System.out.println(text);
            }
            input = scanner.nextLine();
        }
    }
}

