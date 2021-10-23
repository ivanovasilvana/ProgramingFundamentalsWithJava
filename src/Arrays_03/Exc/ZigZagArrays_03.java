package Arrays_03.Exc;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();

            if (i % 2 == 0) {
                firstArray[i] = firstNum;
                secondArray[i] = secondNum;
            } else {
                firstArray[i] = secondNum;
                secondArray[i] = firstNum;
            }
        }
        for (int elementInFirstArray : firstArray) {
            System.out.print(elementInFirstArray + " ");
        }
        System.out.println();
        for (int elementInSecondArray : secondArray) {
            System.out.print(elementInSecondArray + " ");
        }
    }
}