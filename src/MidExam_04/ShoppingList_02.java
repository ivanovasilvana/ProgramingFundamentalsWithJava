package MidExam_04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> groceries = Arrays.stream(scanner.nextLine()
                .split("!"))
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String command = input.split(" ")[0];

            if (command.equals("Urgent")) {
                String item = input.split(" ")[1];

                if (!groceries.contains(item)) {
                    groceries.add(0, item);
                }
            } else if (command.equals("Unnecessary")) {
                String item = input.split(" ")[1];

                if (groceries.contains(item)) {
                    groceries.remove(String.valueOf(item));
                }
            } else if (command.equals("Correct")) {
                String oldItem = input.split(" ")[1];
                String newItem = input.split(" ")[2];

                if (groceries.contains(oldItem)) {
                    int index = groceries.indexOf(oldItem);
                    groceries.set(index, newItem);
                }
            } else if (command.equals("Rearrange")) {
                String item = input.split(" ")[1];
                if (groceries.contains(item)) {
                    groceries.remove(item);
                    groceries.add(item);
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", groceries));
    }
}