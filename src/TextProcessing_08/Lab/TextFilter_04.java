package TextProcessing_08.Lab;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannWord : bannedWords) {
            if (text.contains(bannWord)) {
               // String replacementWord = repeatString("*", bannWord.length());
                text = text.replace(bannWord, "*".repeat(bannWord.length()));
            }
        }
        System.out.println(text);
    }

    /* public static String repeatString(String word, int count) {
        String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }
        return String.join("", repeatArr);
    }*/
}
