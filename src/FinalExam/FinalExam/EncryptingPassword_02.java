package FinalExam.FinalExam;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncryptingPassword_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfInputs = Integer.parseInt(scanner.nextLine());
        String regex = "(?<firstGroup>.*)[>](?<numbers>[0-9]{3})[|](?<lowerCase>[a-z]{3})[|](?<upperCase>[A-Z]{3})[|](?<symbols>[^<>]{3})[<]\\k<firstGroup>$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = null;
        for (int i = 0; i < countOfInputs; i++) {
            String input = scanner.nextLine();
            matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.println("Password: " +
                        matcher.group("numbers") +
                        matcher.group("lowerCase") +
                        matcher.group("upperCase") +
                        matcher.group("symbols"));
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}
