package Arrays_03.MoreExc;

import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());

        int[] firstArray = {1};
        int[] secondArray = {1, 1};


        for (int i = 0; i < secondArray.length + 1; i++) {
            if (i == 0) {
                System.out.println(Arrays.toString(firstArray).replaceAll("[\\[\\],]", ""));
            } else if (i == 1) {
                System.out.println(Arrays.toString(secondArray).replaceAll("[\\[\\],]", ""));
            } else {
                int[] array = new int[secondArray.length + 1];
                array[0] = 1;
                array[array.length - 1] = 1;
                for (int j = 1; j < array.length - 1; j++) {
                    array[j] = secondArray[j - 1] + secondArray[j];
                }
                System.out.println(Arrays.toString(array).replaceAll("[\\[\\]\\,]", ""));
                secondArray = array;

            }
        }
    }

}


