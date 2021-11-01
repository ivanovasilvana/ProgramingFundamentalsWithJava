package ObjectsAndClasses_06.Exc.VehicleCatalogue_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> catalog = new ArrayList<>();
        double sumTrucks = 0;
        int countTrucks = 0;
        double sumCars = 0;
        int countCars = 0;

        while (!input.equals("End")) {
            String type = input.split("\\s+")[0];
            String model = input.split("\\s+")[1];
            String color = input.split("\\s+")[2];
            int horsepower = Integer.parseInt(input.split("\\s+")[3]);
            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            catalog.add(vehicle);
            input = scanner.nextLine();
        }
        String models = scanner.nextLine();
        while (!models.equals("Close the Catalogue")){
            for (Vehicle vehicle : catalog) {
                if (models.equals(vehicle.getModel())){
                    if (vehicle.getType().equals("car")){
                        vehicle.setType("Car");
                    }else if(vehicle.getType().equals("truck")){
                        vehicle.setType("Truck");
                    }
                    System.out.println(vehicle);

                    if (vehicle.getType().equals("Car")){
                        vehicle.setType("car");
                    }else if(vehicle.getType().equals("Truck")){
                        vehicle.setType("truck");
                    }
                }
            }
            models = scanner.nextLine();
        }
        for (Vehicle vehicle : catalog) {
            if (vehicle.getType().equals("car")) {
                sumCars += vehicle.getHorsepower();
                countCars++;
            } else if (vehicle.getType().equals("truck")) {
                sumTrucks += vehicle.getHorsepower();
                countTrucks++;
            }
        }
        if (sumCars == 0 || countCars == 0) {
            System.out.println("Cars have average horsepower of: 0.00.");
        } else {
            System.out.printf("Cars have average horsepower of: %.2f.%n", sumCars / countCars);
        }
        if (sumTrucks == 0 || countTrucks == 0) {
            System.out.println("Trucks have average horsepower of: 0.00.");
        } else {
            System.out.printf("Trucks have average horsepower of: %.2f.%n", sumTrucks / countTrucks);
        }
    }
    
}
