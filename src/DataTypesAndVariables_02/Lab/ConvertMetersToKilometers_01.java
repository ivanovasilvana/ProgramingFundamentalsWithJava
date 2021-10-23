package DataTypesAndVariables_02.Lab;

import java.util.Scanner;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int metres = Integer.parseInt(scanner.nextLine());
        double kilometres = metres / 1000.00;
        System.out.printf("%.2f", kilometres);
    }
}

