package Methods_04.Exc;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        System.out.println(subtract(first, second, third));

    }

    public static int sum(int first, int second) {

        return first + second;
    }

    public static int subtract(int first, int second, int third) {

        return sum(first, second) - third;
    }
}