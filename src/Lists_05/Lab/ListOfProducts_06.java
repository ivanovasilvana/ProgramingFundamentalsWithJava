package Lists_05.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = Integer.parseInt(scanner.nextLine());
        int number = 0;
        List<String> productList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        for (int i = 1; i < line; i++) {
            String product = scanner.nextLine();
            productList.add(product);
        }
        Collections.sort(productList);
        for (String product : productList) {
            number++;
            System.out.printf("%d.%s%n", number, product);
        }
    }
}