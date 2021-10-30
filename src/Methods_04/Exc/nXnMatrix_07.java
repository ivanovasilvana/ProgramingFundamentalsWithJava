package Methods_04.Exc;

import java.util.Scanner;

public class nXnMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            matrix(number);
        }
    }

    public static void matrix(int number) {
        for (int i = 0; i <number ; i++) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}