package RegularExpressions_09.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MatchFullName_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        Pattern pattern = Pattern.compile(regex);
        for (String name : names) {
            Matcher matcher = pattern.matcher(name);
            while (matcher.find()) {
                System.out.print(matcher.group() + " ");
            }
        }
    }
}
