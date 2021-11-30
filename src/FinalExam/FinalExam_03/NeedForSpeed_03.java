package FinalExam.FinalExam_03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeed_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> mileage = new LinkedHashMap<>();
        Map<String, Integer> fuel = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String carInfo = scanner.nextLine();
            String car = carInfo.split("\\|")[0];
            int currentMileage = Integer.parseInt(carInfo.split("\\|")[1]);
            int currentFuel = Integer.parseInt(carInfo.split("\\|")[2]);

            mileage.putIfAbsent(car, currentMileage);
            fuel.putIfAbsent(car, currentFuel);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] tokens = input.split(" : ");
            String command = tokens[0];
            String car = tokens[1];

            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(tokens[2]);
                    int fuelNeed = Integer.parseInt(tokens[3]);

                    if (fuel.get(car) < fuelNeed) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        mileage.put(car, mileage.get(car) + distance);
                        fuel.put(car, fuel.get(car) - fuelNeed);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuelNeed);
                    }
                    if (mileage.get(car) >= 100000) {
                        fuel.remove(car);
                        mileage.remove(car);
                        System.out.printf("Time to sell the %s!%n", car);
                    }
                    break;
                case "Refuel":
                    int fuelToAdd = Integer.parseInt(tokens[2]);
                    int refueled = Math.abs(75 - fuel.get(car));
                    if (fuel.get(car) + fuelToAdd >= 75) {
                        fuel.put(car, 75);
                        System.out.printf("%s refueled with %d liters%n", car, refueled);
                    } else {
                        fuel.put(car, fuel.get(car) + fuelToAdd);
                        System.out.printf("%s refueled with %d liters%n", car, fuelToAdd);
                    }

                    break;
                case "Revert":
                    int kilometres = Integer.parseInt(tokens[2]);
                    mileage.put(car, mileage.get(car) - kilometres);
                    if (mileage.get(car) < 10000) {
                        mileage.put(car, 10000);
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometres);
                    }
            }
            input = scanner.nextLine();
        }

        mileage.entrySet()
                .stream()
                .sorted((m1, m2) -> {
                    int result = m2.getValue() - m1.getValue();
                    if (result == 0) {
                        int resultCar = m1.getKey().compareTo(m2.getKey());
                        return resultCar;
                    }
                    return result;
                })
                .forEach(entry -> {
                    System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                            entry.getKey(), entry.getValue(), fuel.get(entry.getKey()));
                });
    }
}
