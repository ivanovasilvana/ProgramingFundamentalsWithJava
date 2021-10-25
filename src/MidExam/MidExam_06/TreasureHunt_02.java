package MidExam.MidExam_06;

import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> treasure = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {
            List<String> stolenItem = new ArrayList<>();
            String command = input.split(" ")[0];
            if ("Loot".equals(command)) {
                List<String> loots = Arrays.stream(input.split(" ")).collect(Collectors.toList());
                loots.remove(0);
                for (int i = 0; i < loots.size(); i++) {
                    if (!treasure.contains(loots.get(i))) {
                        treasure.add(0, loots.get(i));
                    }
                }
            } else if ("Drop".equals(command)) {
                int index = Integer.parseInt(input.split(" ")[1]);
                if (index >= 0 && index < treasure.size() - 1) {
                    String loot = treasure.get(index);
                    treasure.remove(index);
                    treasure.add(loot);
                }
            } else if ("Steal".equals(command)) {
                int count = Integer.parseInt(input.split(" ")[1]);
                if (count >= treasure.size()) {
                    System.out.println(String.join(", ", treasure));
                    treasure.clear();
                } else {
                    for (int i = 0; i < count; i++) {
                        stolenItem.add(treasure.get(treasure.size() - 1));
                        treasure.remove(treasure.size() - 1);
                    }
                    Collections.reverse(stolenItem);
                    System.out.println(String.join(", ", stolenItem));
                }
            }
            input = scanner.nextLine();
        }
        double averageGain = 0;
        int sumOfLength = 0;

        if (treasure.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            for (int i = 0; i < treasure.size(); i++) {
                for (int j = 0; j < treasure.get(i).length(); j++) {
                    sumOfLength++;
                }
            }
            averageGain = 1.0 * sumOfLength / (double) treasure.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
        }
    }
}
