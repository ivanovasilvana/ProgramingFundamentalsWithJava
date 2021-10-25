package MidExam.MidExam_01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        int moves = 0;

        while (!command.equals("end")) {
            String indexes = scanner.nextLine();

            int firstIndex = Integer.parseInt(indexes.split("\\s+")[0]);
            int secondIndex = Integer.parseInt(indexes.split("\\s+")[1]);


            if (!elements.isEmpty()) {
                moves++;
                if (firstIndex == secondIndex || firstIndex < 0 || secondIndex < 0 || firstIndex > elements.size()-1 || secondIndex > elements.size()-1) {
                    System.out.println("Invalid input! Adding additional elements to the board");
                    int indexToInsert = elements.size() / 2 ;
                    elements.add(indexToInsert, "-" + moves + "a");
                    elements.add(indexToInsert + 1, "-" + moves + "a");
                } else {
                    if (elements.get(firstIndex).equals(elements.get(secondIndex))) {
                        System.out.printf("Congrats! You have found matching elements - %s!%n", elements.get(firstIndex));
                        String firstElement = elements.get(firstIndex);
                        String secondElement = elements.get(secondIndex);
                        elements.remove(String.valueOf(firstElement));
                        elements.remove(String.valueOf(secondElement));

                    } else {
                        System.out.println("Try again!");
                    }
                }
            }
            command = scanner.nextLine();
        }

        if (elements.isEmpty()) {
            System.out.printf("You have won in %d turns!", moves);
        } else {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", elements));
        }
    }
}