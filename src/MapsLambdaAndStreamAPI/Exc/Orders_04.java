package MapsLambdaAndStreamAPI.Exc;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Orders_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productInfo = scanner.nextLine();
        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while (!productInfo.equals("buy")) {
            String productName = productInfo.split(" ")[0];
            double price = Double.parseDouble(productInfo.split(" ")[1]);
            int quantity = Integer.parseInt(productInfo.split(" ")[2]);
            if (!productPrice.containsKey(productName)) {
                productPrice.putIfAbsent(productName, price);
                productQuantity.putIfAbsent(productName, quantity);
            } else {
                int currentQuantity = productQuantity.get(productName);
                productPrice.put(productName, price);
                productQuantity.put(productName, currentQuantity + quantity);
            }
            productInfo = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productPrice.entrySet()) {
            for (Map.Entry<String, Integer> entry1 : productQuantity.entrySet()) {
                if (entry.getKey().equals(entry1.getKey())) {
                    System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue() * entry1.getValue());
                }
            }
        }
    }
}
