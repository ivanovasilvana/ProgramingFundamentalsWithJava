package FinalExam.FinalExam_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<String> mirrorWords = new ArrayList<>();
        int counter = 0;

        String regex = "([@#])(?<firstWord>[A-Za-z]{3,})\\1{2}(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            counter++;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");

            StringBuilder second = new StringBuilder(secondWord);
            String secondWordReversed = second.reverse().toString();
            if (firstWord.equals(secondWordReversed)) {
                mirrorWords.add(firstWord + " <=> " + secondWord);
            }
        }
        if (counter == 0) {
            System.out.println("No word pairs found!\n" +
                    "No mirror words!");
        } else {
            System.out.println(counter + " word pairs found!");
            if (mirrorWords.isEmpty()) {
                System.out.println("No mirror words!");
            } else {
                System.out.println("The mirror words are:");
                System.out.println(String.join(", ", mirrorWords));
            }
        }

    }
}
