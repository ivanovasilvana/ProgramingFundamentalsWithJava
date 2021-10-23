package Arrays_03.Exc;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int count = 0;
        int equalElement = 0;
        int currentCount = 0;
        boolean isEqual = false;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                currentCount++;
                isEqual = true;
            } else {
                currentCount = 0;
            }
            if (currentCount > count) {
                equalElement = numbers[i];
                count = currentCount;
            }


        }
        if(isEqual) {
            for (int i = 0; i <= count; i++) {
                System.out.print(equalElement + " ");
            }
        }else{
            System.out.print(numbers[0]);
        }
    }
}
