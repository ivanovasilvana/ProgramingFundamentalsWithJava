package FinalExam.FinalExam_05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> populations = new TreeMap<>();
        Map<String, Integer> golds = new TreeMap<>();

        while (!input.equals("Sail")) {

            String[] information = input.split("[|]{2}");
            String city = information[0];
            int population = Integer.parseInt(information[1]);
            int gold = Integer.parseInt(information[2]);

            if (populations.containsKey(city)) {
                populations.put(city, populations.get(city) + population);
                golds.put(city, golds.get(city) + gold);
            } else {
                populations.put(city, population);
                golds.put(city, gold);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("=>");
            String command = tokens[0];
            String town = tokens[1];

            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(tokens[2]);
                    int plunderedGold = Integer.parseInt(tokens[3]);

                    populations.put(town, populations.get(town) - people);
                    golds.put(town, golds.get(town) - plunderedGold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, plunderedGold, people);

                    if (populations.get(town) <= 0 || golds.get(town) <= 0) {
                        populations.remove(town);
                        golds.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                    break;
                case "Prosper":
                    int goldToAdd = Integer.parseInt(tokens[2]);
                    if (goldToAdd < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        golds.put(town, golds.get(town) + goldToAdd);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                goldToAdd, town, golds.get(town));
                    }
            }
            input = scanner.nextLine();
        }
        if (populations.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", populations.size());
            golds.entrySet().stream().sorted((g1, g2) -> {
                int result = g2.getValue() - g1.getValue();
                return result;
            }).forEach(town -> {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                        town.getKey(), populations.get(town.getKey()), town.getValue());
            });
        }
    }
}
