package MidExam_06;

import java.util.Arrays;
import java.util.Scanner;

public class ManOWar_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pirateShip = Arrays
                .stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] warship = Arrays
                .stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxHealth = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        boolean isFinished = false;

        while (!input.equals("Retire")) {
            String command = input.split(" ")[0];
            if (command.equals("Fire")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int damage = Integer.parseInt(input.split(" ")[2]);

                if (index >= 0 && index < warship.length) {
                    warship[index] -= damage;
                    if (warship[index] <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        isFinished = true;
                        break;
                    }
                }
            } else if (command.equals("Defend")) {
                int startIndex = Integer.parseInt(input.split(" ")[1]);
                int endIndex = Integer.parseInt(input.split(" ")[2]);
                int damage = Integer.parseInt(input.split(" ")[3]);

                if (startIndex >= 0 && endIndex >= 0 && endIndex < pirateShip.length && startIndex < endIndex) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        pirateShip[i] -= damage;
                        if (pirateShip[i] <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            isFinished = true;
                            break;
                        }
                    }
                }
            } else if (command.equals("Repair")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int health = Integer.parseInt(input.split(" ")[2]);
                if (index >= 0 && index < pirateShip.length) {
                    pirateShip[index] += health;
                    if (pirateShip[index] > maxHealth) {
                        pirateShip[index] = maxHealth;
                    }
                }
            } else if (command.equals("Status")) {
                int count = 0;
                for (int j : pirateShip) {
                    if (j < maxHealth * 0.2) {
                        count++;
                    }
                }
                System.out.println(count + " sections need repair.");
            }
            input = scanner.nextLine();
        }
        if (!isFinished) {
            int pirateShipSum = 0;
            int warshipSum = 0;
            for (int j : pirateShip) {
                pirateShipSum += j;
            }
            for (int j : warship) {
                warshipSum += j;
            }
            System.out.println("Pirate ship status: " + pirateShipSum);
            System.out.println("Warship status: " + warshipSum);
        }
    }
}
