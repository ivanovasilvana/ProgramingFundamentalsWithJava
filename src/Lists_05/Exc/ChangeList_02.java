package Lists_05.Exc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split("\\s+")[0];
            if (command.equals("Delete")) {
                int element = Integer.parseInt(input.split(" ")[1]);
                for (int i = 0; i < integerList.size(); i++) {
                    if (integerList.contains(element)) {
                        integerList.remove(Integer.valueOf(element));
                        i = -1;
                    }
                }
            } else if (command.equals("Insert")) {
                int element = Integer.parseInt(input.split(" ")[1]);
                int position = Integer.parseInt(input.split(" ")[2]);
                integerList.add(position, element);
            }
            input = scanner.nextLine();
        }
        System.out.println(integerList.toString().replaceAll("[\\[\\],]", ""));
    }
}
