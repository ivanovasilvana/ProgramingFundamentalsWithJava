package DataTypesAndVariables_02.Exc;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = Byte.parseByte(scanner.nextLine());
        int litres = 0;
        int capacity = 255;
        for (int i = 0; i < n; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());
            if (capacity >= quantities) {
                capacity -= quantities;
                litres += quantities;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(litres);
    }
}
