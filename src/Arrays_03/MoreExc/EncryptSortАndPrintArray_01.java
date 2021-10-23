package Arrays_03.MoreExc;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortАndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] output = new int[count];
        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                char letter = input.charAt(j);
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || /*letter == 'y' ||*/
                        letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' /*|| letter == 'Y'*/) {
                    sum = sum + ((int) letter * input.length());
                } else {
                    sum = sum + ( (int) letter / input.length());
                }
            }
            output[i] = sum;
            sum = 0;
        }
        Arrays.sort(output);

        for (int elements : output) {
            System.out.println(elements);
        }
    }
}
