package MapsLambdaAndStreamAPI.Exc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int line = Integer.parseInt(scanner.nextLine());
        Map<String, String> registered = new LinkedHashMap<>();

        for (int i = 0; i < line; i++) {
            String input = scanner.nextLine();
            String command = input.split("\\s+")[0];

            if (command.equals("register")) {
                String userName = input.split("\\s+")[1];
                String licensePlateNumber = input.split("\\s+")[2];
                if (registered.containsKey(userName)) {
                    System.out.println("ERROR: already registered with plate number " + licensePlateNumber);
                } else {
                    registered.putIfAbsent(userName, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", userName, licensePlateNumber);
                }
            } else if (command.equals("unregister")) {
                String userName = input.split("\\s+")[1];
                if (!registered.containsKey(userName)) {
                    System.out.printf("ERROR: user %s not found%n", userName);
                } else {
                    System.out.printf("%s unregistered successfully%n", userName);
                    registered.remove(userName);
                }
            }
        }
        for (Map.Entry<String, String> entry : registered.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());

        }
    }
}
