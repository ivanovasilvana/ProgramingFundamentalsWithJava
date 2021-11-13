package MapsLambdaAndStreamAPI.Exc;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourceCount = new LinkedHashMap<>();
        String resource = scanner.nextLine();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (resourceCount.containsKey(resource)) {
                int currentQuantity = resourceCount.get(resource);
                resourceCount.put(resource, currentQuantity + quantity);
            } else {
                resourceCount.put(resource, quantity);
            }
            resource = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourceCount.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
