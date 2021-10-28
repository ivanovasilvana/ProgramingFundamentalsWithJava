package Lists_05.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays
         .stream(scanner.nextLine().split(" "))
         .map(Integer::parseInt)
         .collect(Collectors.toList());

        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < input.size() - 1; i++) {
            input.set(i, input.get(i) + input.get(input.size() - 1));
            input.remove(input.size()-1);
        }
        for (int element:input) {
            System.out.print(element + " ");
        }
    }
}
