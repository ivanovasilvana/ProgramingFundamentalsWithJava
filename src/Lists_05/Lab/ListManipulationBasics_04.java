package Lists_05.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> num = Arrays
                        .stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String command =input.split(" ")[0];

            if (command.equals("Add")){
                int number = Integer.parseInt(input.split(" ")[1]);
                num.add(number);
            }else if (command.equals("Remove")){
                int number = Integer.parseInt(input.split(" ")[1]);
                num.remove(Integer.valueOf(number));
            }else if (command.equals("RemoveAt")){
                int index = Integer.parseInt(input.split(" ")[1]);
                num.remove(index);
            }else if (command.equals("Insert")){
                int number = Integer.parseInt(input.split(" ")[1]);
                int index = Integer.parseInt(input.split(" ")[2]);
                num.add(index, number);
            }
            input = scanner.nextLine();
        }
        for (int element:num) {
            System.out.print(element + " ");
        }

    }
}
