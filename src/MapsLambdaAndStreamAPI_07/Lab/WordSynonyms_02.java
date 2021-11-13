package MapsLambdaAndStreamAPI_07.Lab;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            synonyms.putIfAbsent(word, new ArrayList<>());
            synonyms.get(word).add(synonym);
        }
        for (Map.Entry<String, List<String>> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
