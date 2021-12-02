package FinalExam.FinalExam_05;

import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> emojis = new ArrayList<>();
        BigInteger coolThreshold = new BigInteger("1");

        String regexEmoji = "([:*])\\1[A-Z][a-z]{2,}\\1{2}";
        Pattern pattern = Pattern.compile(regexEmoji);
        Matcher matcher = pattern.matcher(input);
        int counter = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int digit =Character.getNumericValue(currentChar);

            if (Character.isDigit(currentChar)) {
               coolThreshold = coolThreshold.multiply(BigInteger.valueOf(digit));
            }
        }

        while (matcher.find()){
            counter++;
            String currentEmoji = matcher.group();
            int currentThreshold = 0;
            for (int i = 2; i < currentEmoji.length() - 2; i++) {

                int threshold = currentEmoji.charAt(i);
                currentThreshold+=threshold;
            }
            if (coolThreshold.compareTo(BigInteger.valueOf(currentThreshold)) == -1){
                emojis.add(matcher.group());
            }

        }
        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(counter + " emojis found in the text. The cool ones are:");
        emojis.forEach(emoji -> System.out.println(emoji));
    }
}