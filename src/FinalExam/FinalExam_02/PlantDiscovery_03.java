package FinalExam.FinalExam_02;

import java.util.*;

public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantRarity = new LinkedHashMap<>();
        Map<String, Double> plantRating = new LinkedHashMap<>();

        for (int i = 0; i < lines; i++) {
            String information = scanner.nextLine();
            String plant = information.split("<->")[0];
            int rarity = Integer.parseInt(information.split("<->")[1]);

            plantRarity.put(plant, rarity);
            plantRating.putIfAbsent(plant, 0.0);
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {
            String[] tokens = input.split("[: -]+");
            String command = tokens[0];
            String plant = tokens[1];
            switch (command) {
                case "Rate":
                    double rating = Double.parseDouble(tokens[2]);
                    if (plantRating.containsKey(plant)) {
                        if (plantRating.get(plant) == 0.0) {
                            plantRating.put(plant, rating);
                        } else {
                            double newRate = (plantRating.get(plant) + rating) / 2;
                            plantRating.put(plant, newRate);
                        }
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Update":
                    int newRarity = Integer.parseInt(tokens[2]);
                    if (plantRarity.containsKey(plant)) {
                        plantRarity.put(plant, newRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Reset":

                    if (plantRating.containsKey(plant)) {
                        plantRating.put(plant, 0.0);
                    } else {
                        System.out.println("error");
                    }
                    break;

            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantRarity.entrySet()
                .stream()
                .sorted((p1, p2) ->{
                    int resultRarity = p2.getValue() - p1.getValue(); //сортиране по rarity
                    if (resultRarity == 0){
                        double resultRating = (plantRating.get(p2.getKey()) - plantRating.get(p1.getKey()));
                        return (int)resultRating;
                    }
                    return resultRarity;
                })
                .forEach(entry ->{
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                            entry.getKey(), entry.getValue(), plantRating.get(entry.getKey()));
                });
    }
}
