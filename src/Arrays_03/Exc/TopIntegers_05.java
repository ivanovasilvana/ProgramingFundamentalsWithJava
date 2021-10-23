package Arrays_03.Exc;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isTop = false;
        for (int i = 0; i < array.length; i++) {
            int currentNum = array[i];
            if (i == array.length - 1) {
                System.out.println(currentNum + " ");
                continue;
            }
            for (int j = i + 1; j < array.length; j++) {
                if (currentNum > array[j]) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(array[i] + " ");
            }
            isTop = false;
        }

    }
}