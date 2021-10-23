package BasicSyntaxConditionalStatementsAndLoops_01.Exc;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();
        double pricePerNight = 0;
        double totalPrice = 0;

        switch (day) {
            case "Friday":
                switch (type) {
                    case "Students":
                        pricePerNight = 8.45;
                        break;
                    case "Business":
                        pricePerNight = 10.90;
                        break;
                    case "Regular":
                        pricePerNight = 15;
                        break;
                }
                break;
            case "Saturday":
                switch (type) {
                    case "Students":
                        pricePerNight = 9.80;
                        break;
                    case "Business":
                        pricePerNight = 15.60;
                        break;
                    case "Regular":
                        pricePerNight = 20;
                        break;
                }
                break;
            case "Sunday":
                switch (type) {
                    case "Students":
                        pricePerNight = 10.46;
                        break;
                    case "Business":
                        pricePerNight = 16;
                        break;
                    case "Regular":
                        pricePerNight = 22.5;
                        break;
                }
                break;
        }
        totalPrice = pricePerNight * count;

        if (type.equals("Students") && count >= 30) {
            totalPrice = totalPrice - 0.15 * totalPrice;
        } else if (type.equals("Business") && count >= 100) {
            totalPrice = totalPrice - 10 * pricePerNight;
        } else if (type.equals("Regular") && count >= 10 && count <= 20) {
            totalPrice = totalPrice - 0.05 * totalPrice;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}

