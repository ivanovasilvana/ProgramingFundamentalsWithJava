package FinalExam.FinalExam_01;

import java.util.*;
import java.util.stream.Collector;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> composers = new TreeMap<>();
        Map<String, String> keys = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String piece = input.split("\\|")[0];
            String composer = input.split("\\|")[1];
            String key = input.split("\\|")[2];
            composers.putIfAbsent(piece, composer);
            keys.putIfAbsent(piece, key);
        }
        String tokens = scanner.nextLine();
        while (!tokens.equals("Stop")) {
            String command = tokens.split("\\|")[0];
            if (command.equals("Add")) {
                String piece = tokens.split("\\|")[1];
                String composer = tokens.split("\\|")[2];
                String key = tokens.split("\\|")[3];

                if (composers.containsKey(piece) && keys.containsKey(piece)) {
                    System.out.printf("%s is already in the collection!%n", piece);
                } else {
                    composers.putIfAbsent(piece, composer);
                    keys.putIfAbsent(piece, key);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                }
            } else if (command.equals("Remove")) {
                String piece = tokens.split("\\|")[1];
                if (composers.containsKey(piece)) {
                    composers.remove(piece);
                    keys.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            } else if (command.equals("ChangeKey")) {
                String piece = tokens.split("\\|")[1];
                String newKey = tokens.split("\\|")[2];
                if (keys.containsKey(piece)) {
                    keys.put(piece, newKey);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }
            tokens = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : keys.entrySet()) {
            for (Map.Entry<String, String> entry1 : composers.entrySet()) {
                if (entry.getKey().equals(entry1.getKey())) {
                    System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry1.getValue(), entry.getValue());
                }
            }
        }
    }
}
