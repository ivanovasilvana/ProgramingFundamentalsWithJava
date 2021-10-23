package Arrays_03.Exc;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int rotations = Integer.parseInt(scanner.nextLine());
        String[] array = input.split(" ");
        for (int i = 0; i < rotations; i++) {
            String element = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = element;
        }
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}