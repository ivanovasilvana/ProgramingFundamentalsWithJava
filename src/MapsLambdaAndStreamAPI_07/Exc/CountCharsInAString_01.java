package MapsLambdaAndStreamAPI_07.Exc;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<Character, Integer> countChars = new LinkedHashMap<>();
        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!countChars.containsKey(symbol)) {
                countChars.put(symbol, 1);
            } else {
                int currentCount = countChars.get(symbol);
                countChars.put(symbol, currentCount + 1);
            }
        }

        /* countChars.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));*/
        for (Map.Entry<Character, Integer> entry : countChars.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

