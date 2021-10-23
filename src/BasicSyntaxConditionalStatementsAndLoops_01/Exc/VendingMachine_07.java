package BasicSyntaxConditionalStatementsAndLoops_01.Exc;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        double money;
        double sum = 0;
        double price;
        while (!input.equals("Start")) {
            money = Double.parseDouble(input);
            if (money == 0.10 || money == 0.20 || money == 0.50 || money == 1 || money == 2.0) {
                sum += money;

            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }

            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    price = 2;
                    if (price > sum) {
                        System.out.printf("Sorry, not enough money%n");
                    } else {
                        System.out.printf("Purchased %s%n", input);

                        sum -= price;
                    }

                    break;
                case "Water":
                    price = 0.7;
                    if (price > sum) {
                        System.out.printf("Sorry, not enough money%n");
                    } else {
                        System.out.printf("Purchased %s%n", input);

                        sum -= price;
                    }

                    break;
                case "Crisps":
                    price = 1.5;
                    if (price > sum) {
                        System.out.printf("Sorry, not enough money%n");
                    } else {
                        System.out.printf("Purchased %s%n", input);

                        sum -= price;
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (price > sum) {
                        System.out.printf("Sorry, not enough money%n");
                    } else {
                        System.out.printf("Purchased %s%n", input);

                        sum -= price;
                    }
                    break;
                case "Coke":
                    price = 1;
                    if (price > sum) {
                        System.out.printf("Sorry, not enough money%n");
                    } else {
                        System.out.printf("Purchased %s%n", input);

                        sum -= price;
                    }
                    break;
                default:
                    System.out.printf("Invalid product%n");
                    break;
            }


            input = scan.nextLine();

        }
        System.out.printf("Change: %.2f%n", sum);

    }
}

