package Lists_05.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                numbers.remove(numbers.get(i));
                i = -1;
            }
        }
        if (!numbers.isEmpty()) {
            Collections.reverse(numbers);
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        } else {
            System.out.println("empty");
        }
    }
}
