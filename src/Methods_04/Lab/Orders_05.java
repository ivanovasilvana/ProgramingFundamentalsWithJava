package Methods_04.Lab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        switch (product) {
            case "coffee":
                coffee(count);
                break;
            case "water":
                water(count);
                break;
            case "coke":
                coke(count);
                break;
            case "snacks":
                snacks(count);
                break;
        }
    }

    public static void coffee(int count) {
        double sum = count * 1.5;
        System.out.printf("%.2f", sum);
    }

    public static void water(int count) {
        double sum = count * 1.00;
        System.out.printf("%.2f", sum);
    }

    public static void coke(int count) {
        double sum = count * 1.4;
        System.out.printf("%.2f", sum);
    }

    public static void snacks(int count) {
        double sum = count * 2.00;
        System.out.printf("%.2f", sum);
    }
}

