package MidExam_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String command = input.split(" - ")[0];

            if (command.equals("Collect")) {
                String item = input.split(" - ")[1];
                if (!items.contains(item)) {
                    items.add(item);
                }
            } else if (command.equals("Drop")) {
                String item = input.split(" - ")[1];
                if (items.contains(item)) {
                    items.remove(String.valueOf(item));
                }
            } else if (command.equals("Combine Items")) {
                String item = input.split(" - ")[1];
                String oldItem = item.split(":")[0];
                String newItem = item.split(":")[1];

                if (items.contains(oldItem)) {
                    int index = items.indexOf(oldItem);
                    items.add(index + 1, newItem);
                }
            } else if (command.equals("Renew")) {
                String item = input.split(" - ")[1];

                if (items.contains(item)) {
                    items.remove(item);
                    items.add(item);
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", items));

    }
}