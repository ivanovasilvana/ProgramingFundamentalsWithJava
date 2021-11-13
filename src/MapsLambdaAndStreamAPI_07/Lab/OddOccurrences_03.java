package MapsLambdaAndStreamAPI_07.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().toLowerCase().split("\\s+"))
                .collect(Collectors.toList());
        Map<String, Integer> countOfWord = new LinkedHashMap<>();
        List<String> odd = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i);
            if (countOfWord.containsKey(currentWord)) {
                countOfWord.put(currentWord, countOfWord.get(currentWord) + 1);
            } else {
                countOfWord.put(currentWord, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : countOfWord.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odd.add(entry.getKey());
            }
        }
        for (int i = 0; i < odd.size(); i++) {
            System.out.print(odd.get(i));
            if (i < odd.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
