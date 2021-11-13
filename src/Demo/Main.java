package Demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double length = Double.parseDouble(scanner.nextLine());
        final double width = Double.parseDouble(scanner.nextLine());
        final double height = Double.parseDouble(scanner.nextLine());

        Box box;

        try {
            box = new Box(length,width,height);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return;
        }

        System.out.printf("Surface Area - %.2f%n" +
                "Lateral Surface Area - %.2f%n" +
                "Volume – %.2f%n",
                box.calculateSurfaceArea(),
                box.calculateLateralSurfaceArea(),
                box.calculateSurfaceVolume());

    }
}
