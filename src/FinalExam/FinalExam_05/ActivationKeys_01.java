package FinalExam.FinalExam_05;

import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder activationKey = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] tokens = input.split(">>>");
            String command = tokens[0];

            switch (command) {
                case "Contains":
                    String substring = tokens[1];
                    if (activationKey.indexOf(substring) > -1) {
                        System.out.println(activationKey + " contains " + substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String flip = tokens[1];
                    int start = Integer.parseInt(tokens[2]);
                    int end = Integer.parseInt(tokens[3]);
                    String textToFlip = "";
                    switch (flip) {
                        case "Upper":
                            textToFlip = activationKey.substring(start, end).toUpperCase();
                            activationKey.replace(start, end, textToFlip);
                            System.out.println(activationKey);
                            break;
                        case "Lower":
                            textToFlip = activationKey.substring(start, end).toLowerCase();
                            activationKey.replace(start, end, textToFlip);
                            System.out.println(activationKey);
                            break;
                    }
                    break;
                case "Slice":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    activationKey.delete(startIndex, endIndex);
                    System.out.println(activationKey);
                    break;

            }
            input = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + activationKey);
    }
}
