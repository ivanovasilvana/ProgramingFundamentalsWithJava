package Methods_04.Exc;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        int start = Math.min(firstChar, secondChar);
        int stop = Math.max(firstChar, secondChar);
        range(start, stop);
    }

    public static void range(int start, int stop) {
        int count = 0;
        for (int i = start; i < stop; i++) {
            if (count > 0) {
                System.out.print((char) i + " ");
            }
            count++;
        }

    }
}