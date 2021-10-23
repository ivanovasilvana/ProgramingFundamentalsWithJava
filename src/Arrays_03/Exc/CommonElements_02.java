package Arrays_03.Exc;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        String[] firstArray = firstInput.split(" ");
        String[] secondArray = secondInput.split(" ");

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i].equals(secondArray[j])) {
                    System.out.print(secondArray[j] + " ");
                }
            }
        }
    }
}
