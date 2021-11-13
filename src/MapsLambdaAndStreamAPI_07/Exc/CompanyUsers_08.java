package MapsLambdaAndStreamAPI_07.Exc;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> companyUsers = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            if (!companyUsers.containsKey(companyName)) {
                companyUsers.put(companyName, new ArrayList<>());
            }
            if (!companyUsers.get(companyName).contains(employeeId)) {
                companyUsers.get(companyName).add(employeeId);
            }
            input = scanner.nextLine();
        }
        companyUsers.entrySet().forEach(e -> {
            System.out.println(e.getKey());
            e.getValue()
                    .stream()
                    .forEach(user -> System.out.println("-- " + user));
        });
    }
}

