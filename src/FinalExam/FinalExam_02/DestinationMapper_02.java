package FinalExam.FinalExam_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> destinations = new ArrayList<>();
        int travelPoints = 0;
        String regex = "([=\\/])(?<dest>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            travelPoints += matcher.group("dest").length();
            destinations.add(matcher.group("dest"));
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ", destinations));
        System.out.println("Travel Points: " + travelPoints);

    }
}
