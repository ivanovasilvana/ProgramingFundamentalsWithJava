package FinalExam.FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Followers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> likes = new LinkedHashMap<>();
        Map<String, Integer> comments = new LinkedHashMap<>();
        Map<String, Integer> followers = new TreeMap<>();

        String input = scanner.nextLine();

        while ((!input.equals("Log out"))) {
            String[] tokens = input.split(": ");
            String command = tokens[0];
            String username = tokens[1];
            switch (command) {
                case "New follower":
                    likes.putIfAbsent(username, 0);
                    comments.putIfAbsent(username, 0);
                    followers.putIfAbsent(username, likes.get(username) + comments.get(username));
                    break;
                case "Like":
                    int count = Integer.parseInt(tokens[2]);
                    if (likes.containsKey(username)) {
                        likes.put(username, likes.get(username) + count);
                        followers.put(username, likes.get(username) + comments.get(username));
                    } else {
                        likes.put(username, count);
                        comments.put(username, 0);
                        followers.put(username, likes.get(username) + comments.get(username));
                    }
                    break;
                case "Comment":
                    if (comments.containsKey(username)) {
                        comments.put(username, comments.get(username) + 1);
                        followers.put(username, likes.get(username) + comments.get(username));
                    } else {
                        likes.put(username, 0);
                        comments.put(username, 1);
                        followers.put(username, likes.get(username) + comments.get(username));
                    }
                    break;
                case "Blocked":
                    if (comments.containsKey(username)) {
                        likes.remove(username);
                        comments.remove(username);
                        followers.remove(username);
                    } else {
                        System.out.println(username + " doesn't exist.");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(followers.size() + " followers");
        followers.entrySet()
                .stream()
                .sorted((f2, f1) -> {
                    int result = f1.getValue() - f2.getValue();
                    return result;
                }).forEach(entry -> {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        });
    }
}
