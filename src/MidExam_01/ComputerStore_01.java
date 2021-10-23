package MidExam_01;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double taxes = 0;
        double totalTaxes = 0;
        double price = 0;
        double totalPrice = 0;
        while (!command.equals("special") && !command.equals("regular")) {
            double priceForPart = Double.parseDouble(command);

            if (priceForPart < 0) {
                System.out.println("Invalid price!");
                command = scanner.nextLine();
                continue;
            } else {
                taxes = priceForPart * 0.2;
                totalTaxes+=taxes;
                price += priceForPart;

            }
            command = scanner.nextLine();
            taxes = 0;
        }
        totalPrice += price + totalTaxes;
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            if (command.equals("special")) {
                totalPrice = totalPrice - (totalPrice * 0.1);
            }
            System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$", price, totalTaxes, totalPrice);
        }
    }
}
