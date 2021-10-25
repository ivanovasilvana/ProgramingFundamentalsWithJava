package MidExam.MidExam_24_10_2021;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMaintenance_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> friends = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        int countBlacklisted = 0;
        int countOfLost = 0;

        while (!input.equals("Report")) {
            String command = input.split(" ")[0];

            if (command.equals("Blacklist")) {
                String name = input.split(" ")[1];

                if (friends.contains(name)) {
                    int index = friends.indexOf(name);
                    friends.set(index, "Blacklisted");
                    System.out.println(name + " was blacklisted.");
                    countBlacklisted++;
                } else {
                    System.out.println(name + " was not found.");
                }
            } else if (command.equals("Error")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                if (index >= 0 && index < friends.size() &&
                        (!friends.get(index).equals("Blacklisted")) &&
                        (!friends.get(index).equals("Lost"))) {
                    System.out.println(friends.get(index) + " was lost due to an error.");
                    friends.set(index, "Lost");
                    countOfLost++;
                }
            } else if (command.equals("Change")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                String newName = input.split(" ")[2];
                if (index >= 0 && index < friends.size()) {
                    String currentName = friends.get(index);
                    friends.set(index, newName);
                    System.out.println(currentName + " changed his username to " + newName + ".");
                }
            }

            input = scanner.nextLine();
        }
        System.out.println("Blacklisted names: " + countBlacklisted);
        System.out.println("Lost names: " + countOfLost);
        System.out.println(String.join(" ", friends));

    }
}
