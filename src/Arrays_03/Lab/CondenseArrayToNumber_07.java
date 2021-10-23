package Arrays_03.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] condense = new int[array.length - 1];
        if (array.length == 1) {
            System.out.println(array[0]);
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < condense.length - i; j++) {
                condense[j] = array[j] + array[j + 1];
            }
            array = condense;
        }
        System.out.print(condense[0]);
    }
}