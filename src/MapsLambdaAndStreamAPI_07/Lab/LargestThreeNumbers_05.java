package MapsLambdaAndStreamAPI_07.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestThreeNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((e1, e2) -> e2.compareTo(e1))
                .limit(3)
                .collect(Collectors.toList());
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
