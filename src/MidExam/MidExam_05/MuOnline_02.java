package MidExam.MidExam_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialHealth = 100;
        int initialBitcoins = 0;
        int countOfRoom = 0;
        List<String> input = Arrays
                .stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        boolean isSuccess = true;
        for (int i = 0; i < input.size(); i++) {
            countOfRoom++;
            String room = input.get(i);
            String command = room.split(" ")[0];
            if (command.equals("potion")) {
                int health = Integer.parseInt(room.split(" ")[1]);
                int amount = 100 - initialHealth;
                initialHealth += health;

                if (initialHealth > 100) {
                    initialHealth = 100;
                    System.out.printf("You healed for %d hp.%n", amount);
                } else {
                    System.out.printf("You healed for %d hp.%n", health);
                }
                System.out.printf("Current health: %d hp.%n", initialHealth);

            } else if (command.equals("chest")) {
                int bitcoins = Integer.parseInt(room.split(" ")[1]);
                initialBitcoins += bitcoins;
                System.out.printf("You found %d bitcoins.%n", bitcoins);

            } else {
                int attack = Integer.parseInt(room.split(" ")[1]);
                initialHealth -= attack;

                if (initialHealth > 0) {
                    System.out.printf("You slayed %s.%n", command);

                } else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", countOfRoom);
                    isSuccess = false;
                    break;

                }
            }
        }
        if (countOfRoom == input.size() && isSuccess) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", initialBitcoins);
            System.out.printf("Health: %d%n", initialHealth);
        }
    }
}
