package MidExam.MidExam_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String command = input.split(" ")[0];
            if (command.equals("Shoot")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int power = Integer.parseInt(input.split(" ")[2]);
                if (index >= 0 && index < targets.size()) {
                    targets.set(index, targets.get(index) - power);
                    if (targets.get(index) <= 0) {
                        targets.remove(index);
                    }
                }
            } else if (command.equals("Add")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int value = Integer.parseInt(input.split(" ")[2]);
                if (index >= 0 && index < targets.size()) {
                    targets.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }
            } else if (command.equals("Strike")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int radius = Integer.parseInt(input.split(" ")[2]);
                if (index - radius >= 0 && index + radius < targets.size()) {
                    for (int i = 0; i < radius * 2 + 1; i++) {
                        targets.remove(index - 1);
                    }
                } else {
                    System.out.println("Strike missed!");
                }
            }
            input = scanner.nextLine();
        }
        List<String> stringTargets = new ArrayList<>(targets.size());
        for (int i = 0; i < targets.size(); i++) {
            stringTargets.add(String.valueOf(targets.get(i)));
        }
        System.out.println(String.join("|", stringTargets));

    }
}
