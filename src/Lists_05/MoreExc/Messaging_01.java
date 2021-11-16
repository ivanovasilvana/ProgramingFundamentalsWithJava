package Lists_05.MoreExc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);
        StringBuilder message = new StringBuilder();


        for (int i = 0; i < numbers.size(); i++) {
            int index = 0;
            int currentNum = numbers.get(i);
            while (currentNum != 0) {
                index += currentNum % 10;
                currentNum /= 10;
            }
            if (index >= text.length()) {
                message.append(text.charAt(index - text.length()));
                text.deleteCharAt(index - text.length());
            } else {
                message.append(text.charAt(index));
                text.deleteCharAt(index);
            }
        }
        System.out.println(message);
    }
}
