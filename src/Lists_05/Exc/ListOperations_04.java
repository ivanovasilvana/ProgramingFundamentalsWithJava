package Lists_05.Exc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String command = input.split("\\s+")[0];
            if (command.equals("Add")) {
                int number = Integer.parseInt(input.split("\\s+")[1]);
                list.add(number);
            } else if (command.equals("Insert")) {
                int number = Integer.parseInt(input.split("\\s+")[1]);
                int index = Integer.parseInt(input.split("\\s+")[2]);
                if (index >= 0 && index < list.size()) {
                    list.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Remove")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                if (index >= 0 && index < list.size()) {
                    list.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Shift")) {
                String leftOrRight = input.split("\\s+")[1];
                int count = Integer.parseInt(input.split("\\s+")[2]);
                if (leftOrRight.equals("left")) {
                    for (int i = 0; i < count; i++) {
                        int firstNumber = list.get(0);
                        list.remove(Integer.valueOf(firstNumber));
                        list.add(firstNumber);
                    }
                } else if (leftOrRight.equals("right")) {
                    for (int i = 0; i < count; i++) {
                        int lastNumber = list.get(list.size() - 1);
                        list.remove(Integer.valueOf(lastNumber));
                        list.add(0, lastNumber);
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
