package Lists_05.Exc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        String specialNumber = input.split("\\s+")[0];
        int power = Integer.parseInt(input.split("\\s+")[1]);

        while (numbers.contains(specialNumber)) {
            int index = numbers.indexOf(specialNumber);
            int left = Math.max(0, index - power);
            int right = Math.min(index + power, numbers.size() - 1);
            for (int i = right; i >= left ; i--) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers.stream().mapToInt(Integer::parseInt).sum());

    }
}

