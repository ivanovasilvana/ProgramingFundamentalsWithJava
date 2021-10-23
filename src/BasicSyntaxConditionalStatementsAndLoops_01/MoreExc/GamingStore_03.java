package BasicSyntaxConditionalStatementsAndLoops_01.MoreExc;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = Double.parseDouble(scan.nextLine());
        String command = scan.nextLine();
        double totalSpend = 0;
        while (!command.equals("Game Time")) {

            switch (command) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    if (balance < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 39.99;
                        totalSpend += 39.99;
                        System.out.printf("Bought %s%n", command);
                    }
                    break;
                case "CS: OG":
                    if (balance < 15.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 15.99;
                        totalSpend += 15.99;
                        System.out.printf("Bought %s%n", command);
                    }
                    break;
                case "Zplinter Zell":
                    if (balance < 19.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 19.99;
                        totalSpend += 19.99;
                        System.out.printf("Bought %s%n", command);
                    }
                    break;
                case "Honored 2":
                    if (balance < 59.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 59.99;
                        totalSpend += 59.99;
                        System.out.printf("Bought %s%n", command);
                    }
                    break;
                case "RoverWatch":
                    if (balance < 29.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 29.99;
                        totalSpend += 29.99;
                        System.out.printf("Bought %s%n", command);
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (balance == 0) {
                System.out.println("Out of money!");
            }
            command = scan.nextLine();
        }
        if (balance != 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, balance);
        }
    }
}

