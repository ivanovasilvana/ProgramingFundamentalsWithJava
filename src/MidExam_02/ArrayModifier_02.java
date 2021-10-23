package MidExam_02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] elements = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String command = input.split(" ")[0];

            if (command.equals("swap")) {
                int firstIndex = Integer.parseInt(input.split(" ")[1]);
                int secondIndex = Integer.parseInt(input.split(" ")[2]);
                int firstElementToSlap = elements[firstIndex];
                int secondElementToSlap = elements[secondIndex];
                elements[firstIndex] = secondElementToSlap;
                elements[secondIndex] = firstElementToSlap;
            } else if (command.equals("multiply")) {
                int firstIndex = Integer.parseInt(input.split(" ")[1]);
                int secondIndex = Integer.parseInt(input.split(" ")[2]);
                int multiply = elements[firstIndex] * elements[secondIndex];
                elements[firstIndex] = multiply;
            } else if (command.equals("decrease")) {
                for (int i = 0; i < elements.length; i++) {
                    elements[i]--;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(Arrays.toString(elements).replaceAll("[\\[\\]]", ""));

    }
}