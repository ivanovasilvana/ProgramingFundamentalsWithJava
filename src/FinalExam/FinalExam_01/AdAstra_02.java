package FinalExam.FinalExam_01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder output = new StringBuilder();

        String regex = "([#|])(?<itemName>[A-Z]+[a-z]+\\s*[A-Z]*[a-z]*)\\1" +
                "(?<day>\\d{2})\\/" +
                "(?<month>\\d{2})\\/" +
                "(?<year>\\d{2})\\1" +
                "(?<calories>\\d{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int calories = 0;
        while (matcher.find()) {

            calories += (Integer.parseInt(matcher.group("calories")));
            output.append(String.format("Item: %s, Best before: %s/%s/%s, Nutrition: %s%n",
                    matcher.group("itemName"),
                    matcher.group("day"),
                    matcher.group("month"),
                    matcher.group("year"),
                    matcher.group("calories")));
        }
        System.out.printf("You have food to last you for: %d days!%n", calories / 2000);
        System.out.print(output);
    }
}
