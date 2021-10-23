package Arrays_03.Exc;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];

        int[] ladyBugsIndexes =Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        for (int ladyBugIndex : ladyBugsIndexes) {
            if (ladyBugIndex >= 0 && ladyBugIndex <= field.length - 1) {
                field[ladyBugIndex] = 1;
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] tokens = command.split(" "); //["0", "right", "1"]
            int index = Integer.parseInt(tokens[0]); //"0" -> 0
            String direction = tokens[1];
            int flyLength = Integer.parseInt(tokens[2]); //"1" -> 1

            if (index >= 0 && index <= field.length - 1 && field[index] == 1) {
                //калинката излетява
                field[index] = 0;
                if (direction.equals("right")) {
                    index += flyLength;
                    while (index <= field.length - 1 && field[index] == 1) {
                        index += flyLength;
                    }
                    if (index <= field.length - 1) {
                        field[index] = 1;

                    }
                } else if (direction.equals("left")) {
                    index -= flyLength;
                    while (index >= 0 && field[index] == 1) {
                        index -= flyLength;
                    }
                    if (index >= 0) {
                        field[index] = 1;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int number : field) {
            System.out.print(number + " ");

        }
    }
}