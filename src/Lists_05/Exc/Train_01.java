package Lists_05.Exc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split("\\s+")[0];
            if (command.equals("Add")) {
                int countOfPeople = Integer.parseInt(input.split("\\s+")[1]);
                wagons.add(countOfPeople);
            } else {
                int countOfPeople = Integer.parseInt(input.split("\\s+")[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + countOfPeople <= maxCapacity) {
                        wagons.set(i, wagons.get(i) + countOfPeople);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
