package Methods_04.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = rectangleArea(width, height);
        System.out.println(new DecimalFormat("0.###").format(area));
    }

    public static double rectangleArea(double width, double height) {
        return width * height;
    }
}
